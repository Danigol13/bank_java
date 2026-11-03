package com.bank.model;

import java.math.BigDecimal;

public class Conta {
    private String numero;
    private String agencia;
    private String tipo;
    private BigDecimal saldo;
    private BigDecimal limite;
   // private Boolean status;


    public String getNumero(){
        return this.numero;
    }

    public void setNumero (String numero){
        this.numero = numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia (String agencia){
        this.agencia = agencia;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo (BigDecimal saldo){
        this.saldo = saldo;
    }

    public BigDecimal getLimite(){
        return  this.limite;
    }

    public void setLimite (BigDecimal limite){
        this.limite = limite;
    }
}


