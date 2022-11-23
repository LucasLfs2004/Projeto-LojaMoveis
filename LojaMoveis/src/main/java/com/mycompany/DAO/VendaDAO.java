package com.mycompany.DAO;

import com.mycompany.model.Venda;
import com.mycompany.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luka
 */
public class VendaDAO {

    public static String[] consultarClientes(String pCPF) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        String[] dadosCliente = new String[2];

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente WHERE cpf LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pCPF + '%');

            rs = instrucaoSQL.executeQuery();

            if (rs.next()) {
                dadosCliente[0] = rs.getString("nome");
                dadosCliente[1] = rs.getString("id_cliente");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            dadosCliente = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return dadosCliente;
    }

    public static ArrayList<Venda> consultarProdutos(String pTipo) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Venda> listaProdutos = new ArrayList<Venda>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE tipo LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pTipo + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Venda c = new Venda();
                c.setTipo(rs.getString("tipo"));
                c.setCor(rs.getString("cor"));
                c.setDescricao(rs.getString("descricao"));
                c.setPreco(rs.getDouble("preco"));
                c.setQuantidade(rs.getInt("quantidade"));
                c.setId(rs.getInt("id_produto"));
                listaProdutos.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProdutos = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaProdutos;
    }

    public static boolean salvarVenda(Venda p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            //Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO venda (id_cliente,nome_cliente,data_compra,valor_total) VALUES(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, p.getIdCliente());
            instrucaoSQL.setString(2, p.getNomeCliente());
            instrucaoSQL.setDate(3, new java.sql.Date(p.getDataVenda().getTime()));
            instrucaoSQL.setDouble(4, p.getValorTotal());

            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

//                GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static boolean salvarItemVenda(Venda p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Passo 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            //Executar uma instrução SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO item_venda (id_venda,id_produto,quantidade_vendida,valor_unitario) VALUES(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, p.getId());
            instrucaoSQL.setInt(2, p.getIdProduto());
            instrucaoSQL.setInt(3, p.getQuantidade());
            instrucaoSQL.setDouble(4, p.getPreco());

            //Executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

//                GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static int consultarProdutos(int idProduto) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        int quantidadeEstocada = 0;

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE id_produto LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, idProduto);

            rs = instrucaoSQL.executeQuery();

            if (rs.next()) {
                quantidadeEstocada = rs.getInt("quantidade");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return quantidadeEstocada;
    }

    public static boolean atualizarEstoque(Venda p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET quantidade = (?) WHERE id_produto = (?) ");
            int quantidadeVendida = p.getQuantidade();
            int quantidadeEstocada = p.getQuantidadeEstocada();
            int quantidadeRestante = quantidadeEstocada - quantidadeVendida;
            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, quantidadeRestante);

            instrucaoSQL.setInt(2, p.getIdProduto());

            //Mando executar a instrução SQL
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                //GerenciadorConexao.fecharConexao();
                conexao.close();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }
}
