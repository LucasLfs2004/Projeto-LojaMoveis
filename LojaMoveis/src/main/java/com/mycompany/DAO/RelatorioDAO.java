package com.mycompany.DAO;

import com.mycompany.model.Relatorio;
import com.mycompany.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.Date;
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
public class RelatorioDAO {

    public static ArrayList<Relatorio> consultarVendas() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Relatorio> listaVendasRealizadas = new ArrayList<Relatorio>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //DriverManager para abrir a conexão
            String URL = "jdbc:mysql://localhost:3306/lojamoveis?useTimezone=true&serverTimezone=UTC&useSSL=false";

            conexao = DriverManager.getConnection(URL, "root", "");

            //Executo a instrução SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM venda;");

            //Executa a Query (Consulta) - Retorna um objeto da classe ResultSet
            rs = instrucaoSQL.executeQuery();

            //Percorrer o resultSet
            while (rs.next()) {
                Relatorio c = new Relatorio();
                c.setId(rs.getInt("id_venda"));
                c.setIdProduto(rs.getInt("id_cliente"));
                c.setNomeCliente(rs.getString("nome_cliente"));
                c.setDataVenda(rs.getDate("data_compra"));
                c.setValorTotal(rs.getDouble("valor_total"));
                listaVendasRealizadas.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVendasRealizadas = null;
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

        return listaVendasRealizadas;
    }

    public static ArrayList<Relatorio> consultarItemVenda(String pId) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Relatorio> listaItemVendas = new ArrayList<Relatorio>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM item_venda WHERE id_venda LIKE ?;");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, "%" + pId + '%');

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Relatorio c = new Relatorio();
                c.setId(rs.getInt("id_venda"));
                c.setIdProduto(rs.getInt("id_produto"));
                c.setQuantidade(rs.getInt("quantidade_vendida"));
                c.setValorUnitario(rs.getDouble("valor_unitario"));
                listaItemVendas.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaItemVendas = null;
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

        return listaItemVendas;
    }

    public static ArrayList<Relatorio> consultarDiaVenda(Date pData) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Relatorio> listaVendasRealizadas = new ArrayList<Relatorio>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM venda WHERE data_compra LIKE ?");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setDate(1, new java.sql.Date(pData.getTime()));

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Relatorio c = new Relatorio();
                c.setId(rs.getInt("id_venda"));
                c.setIdCliente(rs.getInt("id_cliente"));
                c.setNomeCliente(rs.getString("nome_cliente"));
                c.setDataVenda(rs.getDate("data_compra"));
                c.setValorTotal(rs.getDouble("valor_total"));
                listaVendasRealizadas.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVendasRealizadas = null;
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

        return listaVendasRealizadas;
    }

    public static ArrayList<Relatorio> consultarIntervaloVendas(Date pDataInicial, Date pDataFinal) {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Relatorio> listaVendasRealizadas = new ArrayList<Relatorio>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM venda WHERE data_compra BETWEEN ? AND ?");

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setDate(1, new java.sql.Date(pDataInicial.getTime()));
            instrucaoSQL.setDate(2, new java.sql.Date(pDataFinal.getTime()));

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Relatorio c = new Relatorio();
                c.setId(rs.getInt("id_venda"));
                c.setIdCliente(rs.getInt("id_cliente"));
                c.setNomeCliente(rs.getString("nome_cliente"));
                c.setDataVenda(rs.getDate("data_compra"));
                c.setValorTotal(rs.getDouble("valor_total"));
                listaVendasRealizadas.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaVendasRealizadas = null;
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

        return listaVendasRealizadas;
    }

}
