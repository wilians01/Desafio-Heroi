package main.java.com.will.classeDeUmJogo;

import java.util.Scanner;

public class Heroi {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int idade;


    public void criacao (int op1 ){
        System.out.println("Qual é seu nome ?");
        nome = sc.nextLine();


        System.out.println("Qual é sua idade ?");
         idade = sc.nextInt();


        System.out.println("O "+heroi(op1)+" de nome "+nome+" de "+idade+" anos "+"usou "+poderes(op1)+ " para atacar");
    }

    public String heroi(int op ) {
        String tipo = "";
        if (op == 1) {
            tipo ="mago";
        } else if (op == 2) {
            tipo ="monge";
        } else if (op == 3) {
            tipo = "guerreiro";
        } else if (op == 4) {
            tipo = "ninja";
        }
        return tipo ;
    }

    public String poderes(int op ) {
        String tipo = "";
        if (op == 1) {
            tipo ="magia";
        } else if (op == 2) {
            tipo ="artes marciais";
        } else if (op == 3) {
            tipo = "espada";
        } else if (op == 4) {
            tipo = "shuriken";
        }
        return tipo ;
    }


}
