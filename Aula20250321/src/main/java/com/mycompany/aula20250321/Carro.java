package com.mycompany.aula20250321;

public class Carro {
    private String modelo;
    private Motor motor;//Composição
    private Motorista motorista;//Agregação
    private int quantidadeMotoristas;

    public Carro(String modelo, int potencia, String tipoCombustivel, Motorista motorista) {
        this.modelo = modelo;
        this.motor = new Motor(potencia, tipoCombustivel);
        this.motorista = motorista;
        quantidadeMotoristas++;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
        quantidadeMotoristas++;
    }

    public int getQuantidadeMotoristas() {
        return quantidadeMotoristas;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", motor=" + motor + ", motorista=" + motorista + '}';
    }
    
    
}
