package com.mycompany.model;

/**
 *
 * @author Luka
 */
public class Produto {

    private static int qtdProduto;

    private int id;
    private String tipo;
    private double preco;
    private String cor;
    private int quantidade;
    private String descricao;

    public Produto() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdProduto++;
        this.id = qtdProduto;
    }

    public Produto(String tipo, double preco, String cor, int quantidade, String descricao) {
        qtdProduto++;
        this.id = qtdProduto;
        this.tipo = tipo;
        this.preco = preco;
        this.cor = cor;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public Produto(int id, String pTipo, double pPreco, String pCor, int pQuantidade, String pDescricao) {
        this.id = id;
        this.tipo = pTipo;
        this.preco = pPreco;
        this.cor = pCor;
        this.quantidade = pQuantidade;
        this.descricao = pDescricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String pDescricao) {
        this.descricao = pDescricao;
    }
}
