package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a inicial do seu sexo");
        String sx = scan.next();
        if (sx.equalsIgnoreCase("m")) {
            System.out.println("Seu sexo é masculino");
        }
        else if (sx.equalsIgnoreCase( "f")) {
            System.out.println("Seu sexo é feminino");
        } else {
            System.out.println("O sexo é invalido");
        }
    }
}
