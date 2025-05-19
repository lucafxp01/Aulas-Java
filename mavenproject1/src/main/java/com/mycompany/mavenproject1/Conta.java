/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab09
 */
public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
        
    }
    
    
    public void sacar(double valor){
        if(saldo>=valor){
            saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente");
        }    
    }
    
    
    public void aplicarRendimento(){
        saldo = saldo* 1;
    }
    
    
    public String tipoConta(){
        return("Conta poupanca");
    }
    
    
    
    
    
    
    
}
