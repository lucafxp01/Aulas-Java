/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab09
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    
    @Override
    public void sacar(double valor){
        if(getSaldo()>=valor + 15){
            setSaldo(getSaldo()-valor - 15);
        }else{
            System.out.println("Saldo insuficiente");
        }    
    }
    
    @Override
    public void aplicarRendimento(){
        setSaldo (getSaldo()* 1.005);
    }
    
    @Override
    public String tipoConta(){
        return("Conta poupanca");
    }
    
    
    
}
