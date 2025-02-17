package com.mycompany.aula20250217;

import java.io.IOException;
import java.util.Scanner;

public class Aula20250217 {

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 5;

        while(opcao != 0){
            
        
            System.out.printf("=======================================\n");
            System.out.printf("\t\t %s \n", "CALCULADORA");
            System.out.printf("=======================================\n");
            System.out.println("\t[1] Adição (+)");
            System.out.println("\t[2] Subtração (-)");
            System.out.println("\t[3] Multiplicação (*)");
            System.out.println("\t[4] Divisão (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=======================================\n");
            System.out.printf("Escolha uma opção: ");
        
            opcao = scanner.nextInt(); // Captura a opção digitada pelo usuário

            // Validação da opção
            /*if (opcao == 0) {
                System.out.println("Saindo da calculadora... ");
            } else if (opcao >= 1 && opcao <= 4) {
                System.out.println("Opção válida! Você escolheu a opção: " + opcao);
            } else {
                System.out.println("Opção inválida! Digite um número entre 0 e 4.");
            }*/
        
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("ADIÇÃO");
                    break;
                case 2:
                    System.out.println("SUBTRAÇÃO");
                    break;
                case 3:
                    System.out.println("MULTIPLICAÇÃO");
                    break;
                case 4:
                    System.out.println("DIVISÃO");
                    break;
                default:
                    System.out.println(" Opção inválida! Digite um número entre 0 e 4.");
                    break;      
            }
        
        }
        

        scanner.close();
    }
    
    
    
}
