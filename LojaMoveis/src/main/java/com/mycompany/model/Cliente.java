package com.mycompany.model;

import java.util.Date;

/**
 *
 * @author Luka
 */
public class Cliente {

    private static int qtdCliente;

    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String email;
    private String telefone;
    private Date dataCliente;
    private String rua;
    private String cep;

    public Cliente() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdCliente++;
        this.id = qtdCliente;
    }

    public Cliente(String nome, String cpf, String sexo, String estadoCivil, String email, String telefone, Date dataCliente, String rua, String cep) {
        qtdCliente++;
        this.id = qtdCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.telefone = telefone;
        this.dataCliente = dataCliente;
        this.rua = rua;
        this.cep = cep;
    }

    public Cliente(int id, String pNome, String pCPF, String pSexo, String pEstadoCivil, String pEmail, String pTelefone, Date pDataCliente, String pRua, String pCEP) {
        this.id = id;
        this.nome = pNome;
        this.cpf = pCPF;
        this.sexo = pSexo;
        this.estadoCivil = pEstadoCivil;
        this.email = pEmail;
        this.telefone = pTelefone;
        this.dataCliente = pDataCliente;
        this.rua = pRua;
        this.cep = pCEP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String pSexo) {
        this.sexo = pSexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String pEstadoCivil) {
        this.estadoCivil = pEstadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String pTelefone) {
        this.telefone = pTelefone;
    }

    public Date getDataCliente() {
        return dataCliente;
    }

    public void setDataCliente(Date pDataCliente) {
        this.dataCliente = pDataCliente;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String pRua) {
        this.rua = pRua;
    }

    public String getCEP() {
        return cep;
    }

    public void setCEP(String pCEP) {
        this.cep = pCEP;
    }
}
