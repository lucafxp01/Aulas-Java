package com.mycompany.aula20250321;


public class Aula20250321 {
    
    
    
    
    public static void main(String[] args) {
        System.out.println("---Carros---");

        
        Motorista m1 = new Motorista("Cassio", "32154654");
        Motorista m2 = new Motorista("Joao", "78978678");
        Motorista m3 = new Motorista("Pedro", "6456456456");
        
        Carro c1 = new Carro("Celta", 100, "Eletrico", m1);       
        Carro c2 = new Carro("Gol", 150, "Gas", m2);
        
        c1.setMotorista(m2);
        c1.setMotorista(m3);
        c1.setMotorista(m1);
        c2.setMotorista(m3);
        
        //System.out.println(c1);
        //System.out.println("Quantidade Motoristas: "+Motorista.getContMotorista());
        
        System.out.println(c1.getQuantidadeMotoristas());
        System.out.println(c2.getQuantidadeMotoristas());
        
        
    }
}
