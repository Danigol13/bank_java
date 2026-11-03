package com.bank.study;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome = read.next();
        System.out.println("Informe a sua idade");
        int idade = read.nextInt();
        if (idade >= 18) {
        System.out.println(nome +" você é maior de idade");
        }else {
            System.out.println(nome + " menor de idade");
        }

        }
    }

