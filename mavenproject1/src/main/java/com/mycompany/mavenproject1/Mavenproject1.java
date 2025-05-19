/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab09
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Cliente cli= new Cliente("GOTINHA", "2323234");
        cli.criarConta(200, 1);
        cli.criarConta(300, 2);
        cli.criarConta(400, 2);
        
        System.out.println(cli);
        
        cli.mostrarSaldos();
    }
}
