package com.mycompany.DAO;

import com.mycompany.model.Produto;
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
public class ProdutoDAO {

    public static boolean salvar(Produto p) {
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
            instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (tipo,preco,cor,quantidade,descricao) VALUES(?,?,?,?,?)",
                     Statement.RETURN_GENERATED_KEYS);

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getTipo());
            instrucaoSQL.setDouble(2, p.getPreco());
            instrucaoSQL.setString(3, p.getCor());
            instrucaoSQL.setInt(4, p.getQuantidade());
            instrucaoSQL.setString(5, p.getDescricao());

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

    public static boolean atualizar(Produto p) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            instrucaoSQL = conexao.prepareStatement("UPDATE produto SET tipo = ?, preco = ?, cor = ?, quantidade = ?, descricao = ? WHERE id_produto = ? ");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, p.getTipo());
            instrucaoSQL.setDouble(2, p.getPreco());
            instrucaoSQL.setString(3, p.getCor());
            instrucaoSQL.setInt(4, p.getQuantidade());
            instrucaoSQL.setString(5, p.getDescricao());

            instrucaoSQL.setInt(6, p.getId());

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

    public static boolean excluir(int pID) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            instrucaoSQL = conexao.prepareStatement("DELETE FROM produto WHERE id_produto = ?");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setInt(1, pID);

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

    public static ArrayList<Produto> consultarProdutos() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            //Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Produto c = new Produto();
                c.setId(rs.getInt("ID_Produto"));
                c.setTipo(rs.getString("tipo"));
                c.setPreco(rs.getDouble("preco"));
                c.setCor(rs.getString("cor"));
                c.setQuantidade(rs.getInt("quantidade"));
                c.setDescricao(rs.getString("descricao"));

                //Adiciono na listaClientes
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

                conexao.close();
                //GerenciadorConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaProdutos;
    }

    public static ArrayList<Produto> consultarProdutos(String pTipo) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto WHERE tipo LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pTipo + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Produto c = new Produto();
                c.setId(rs.getInt("id_produto"));
                c.setTipo(rs.getString("tipo"));
                c.setPreco(rs.getDouble("preco"));
                c.setCor(rs.getString("cor"));
                c.setQuantidade(rs.getInt("quantidade"));
                c.setDescricao(rs.getString("descricao"));
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

}
