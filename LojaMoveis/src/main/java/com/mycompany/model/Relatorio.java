package com.mycompany.model;

import java.util.Date;

/**
 *
 * @author Luka
 */
public class Relatorio {

    private static int qtdVenda;

    private int id;
    private String nomeCliente;
    private int idCliente;
    private double valorTotal;
    private Date dataVenda;
    private int idProduto;
    private int quantidade;
    private double valorUnitario;

    public Relatorio() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdVenda++;
        this.id = qtdVenda;
    }

    public Relatorio(String nomeCliente, int idCliente, double valorTotal, Date dataVenda, int idProduto, int quantidade, double valorUnitario) {
        qtdVenda++;
        this.id = qtdVenda;
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public Relatorio(int id, String pNomeCliente, int pIdCliente, double pValorTotal, Date pDataVenda, int pIdProduto, int pQuantidade, int pValorUnitario) {
        this.id = id;
        this.nomeCliente = pNomeCliente;
        this.idCliente = pIdCliente;
        this.valorTotal = pValorTotal;
        this.dataVenda = pDataVenda;
        this.idProduto = pIdProduto;
        this.quantidade = pQuantidade;
        this.valorUnitario = pValorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String pNomeCliente) {
        this.nomeCliente = pNomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int pIdCliente) {
        this.idCliente = pIdCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double pValorTotal) {
        this.valorTotal = pValorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date pDataVenda) {
        this.dataVenda = pDataVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int pIdProduto) {
        this.idProduto = pIdProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int pQuantidade) {
        this.quantidade = pQuantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double pValorUnitario) {
        this.valorUnitario = pValorUnitario;
    }
}
