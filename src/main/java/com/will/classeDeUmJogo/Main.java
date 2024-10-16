package main.java.com.will.classeDeUmJogo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sejá bem-vindo");
        System.out.println("Que tipo de Heói você quer ser !!!");
        System.out.println("1 - Mago \n2 - Monge \n3 - Guerriro \n4 - Nija ");
        try {
            int op = sc.nextInt();
            if (op > 0 && op <= 4) {
                heroi.criacao(op);
            } else {
                System.out.println("Escolha um número de 1 a 4.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Somente números de 1 a 4.");
        }

    }




}
