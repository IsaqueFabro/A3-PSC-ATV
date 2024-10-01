package com.mycompany.exercicios.exercicios;

import java.util.Scanner;

public class Exercicio2 {
   
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se a pessoa tem 18 anos ou mais
        if (idade >= 18) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
        scanner.close();
    } 
}
