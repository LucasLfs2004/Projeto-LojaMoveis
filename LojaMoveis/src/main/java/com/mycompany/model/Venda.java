package com.mycompany.model;

import java.util.Date;

/**
 *
 * @author Luka
 */
public class Venda {

    private static int qtdVenda;

    private int id;
    private String cpf;
    private String tipo;
    private double preco;
    private String cor;
    private int quantidade;
    private int quantidadeEstocada;
    private String descricao;
    private String nomeCliente;
    private int idCliente;
    private double valorTotal;
    private Date dataVenda;
    private int idProduto;

    public Venda() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdVenda++;
        this.id = qtdVenda;
    }

    public Venda(String CPF, String tipo, double preco, String cor, int quantidade, int quantidadeEstocada, String descricao, String nomeCliente, int idCliente, double valorTotal, Date dataVenda, int idProduto) {
        qtdVenda++;
        this.id = qtdVenda;
        this.cpf = CPF;
        this.tipo = tipo;
        this.preco = preco;
        this.cor = cor;
        this.quantidade = quantidade;
        this.quantidadeEstocada = quantidadeEstocada;
        this.descricao = descricao;
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public Venda(int id, String pCPF, String pTipo, double pPreco, String pCor, int pQuantidade, int pQuantidadeEstocada, String pDescricao, String pNomeCliente, int pIdCliente, double pValorTotal, Date pDataVenda, int pIdProduto) {
        this.id = id;
        this.cpf = pCPF;
        this.tipo = pTipo;
        this.preco = pPreco;
        this.cor = pCor;
        this.quantidade = pQuantidade;
        this.quantidadeEstocada = pQuantidadeEstocada;
        this.descricao = pDescricao;
        this.nomeCliente = pNomeCliente;
        this.idCliente = pIdCliente;
        this.valorTotal = pValorTotal;
        this.dataVenda = pDataVenda;
        this.idProduto = pIdProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String pTipo) {
        this.tipo = pTipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double pPreco) {
        this.preco = pPreco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String pCor) {
        this.cor = pCor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int pQuantidade) {
        this.quantidade = pQuantidade;
    }

    public int getQuantidadeEstocada() {
        return quantidadeEstocada;
    }

    public void setQuantidadeEstocada(int pQuantidadeEstocada) {
        this.quantidadeEstocada = pQuantidadeEstocada;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String pDescricao) {
        this.descricao = pDescricao;
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
}
