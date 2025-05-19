/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab09
 */

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contas = new ArrayList<>();
    }
    
    
    public void mostrarSaldos(){
        System.out.println("Lista de contas");
        if(contas.isEmpty()){
         System.out.println("Lista vazia");   
        }else{
            for(Conta temp: contas){
                System.out.println(temp.tipoConta()+" : " + temp.getSaldo());
                
            }
        }
  
        
    }public void criarConta(double saldo, int tipo){
    if (tipo == 1){
        ContaCorrente c1 = new ContaCorrente(saldo);
        contas.add(c1);
    } else if (tipo == 2) {
        ContaPoupanca c2 = new ContaPoupanca(saldo);
        contas.add(c2);
    } else {
        System.out.println("Tipo de conta inválido. Use 1 para Corrente, 2 para Poupança.");
    }
}

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", contas=" + contas + '}';
    }

    
    
    
    
}
