package com.mycompany.exercicios.exercicios;

import java.util.Scanner;

public class Exercicio3 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1
        System.out.println("1. Ferva 500ml de água.");
        System.out.print("A água está fervendo? (sim/não): ");
        String aguaFervendo = scanner.nextLine();
        
        while (!aguaFervendo.equalsIgnoreCase("sim")) {
            System.out.println("Esperando a água ferver...");
            System.out.print("A água está fervendo agora? (sim/não): ");
            aguaFervendo = scanner.nextLine();
        }

        // Passo 2
        System.out.println("2. Coloque o miojo na água fervente.");

        // Passo 3
        System.out.println("3. Cozinhe o miojo por 3 minutos, mexendo ocasionalmente.");
        System.out.print("O macarrão está cozido? (sim/não): ");
        String macarraoCozido = scanner.nextLine();

        // Enquanto o macarrão não estiver cozido, continue cozinhando
        while (!macarraoCozido.equalsIgnoreCase("sim")) {
            System.out.println("Cozinhando o miojo...");
            System.out.print("O macarrão está cozido agora? (sim/não): ");
            macarraoCozido = scanner.nextLine();
        }

        // Passo 4
        System.out.println("4. Adicione o tempero do sachê ao macarrão.");

        // Passo 5
        System.out.println("5. Misture bem o tempero no macarrão.");
        System.out.println("6. Seu miojo está pronto! Bom apetite!");

        scanner.close();
    }
}