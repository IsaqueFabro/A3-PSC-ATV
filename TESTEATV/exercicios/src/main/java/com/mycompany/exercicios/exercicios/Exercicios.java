package com.mycompany.exercicios.exercicios;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3;

        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}