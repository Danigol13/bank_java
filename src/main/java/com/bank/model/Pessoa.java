package com.bank.model;

import java.time.LocalDate;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String telefone;
    private String cidade;

    // Retornando o cpf
    public String getCpf(){
        return this.cpf;
    }

    // Alterando o cpf
    public void setCpf (String cpf){
        this.cpf = cpf;
    }

    // Retornando o nome
    public String getNome(){
        return this.nome;
    }
    // Alterando o nome
    public void setNome (String nome){
        this.nome = nome;
    }

    // Retornando o nascimento
    public LocalDate getNascimento(){
        return this.nascimento;
    }

    // Alterando o nascimento
    public void setNascimento (LocalDate nascimento){
        this.nascimento = nascimento;
    }

    // Retornando o telefone
    public String getTelefone (){
        return this.telefone;
    }

    // Alterando o telefone
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }

    public String getCidade (){
        return this.cidade;
    }

    public void setCidade (String cidade){
        this.cidade = cidade;
    }
}






