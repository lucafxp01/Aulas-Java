package com.mycompany.aula20250321;

public class Motor {
    private int potencia;
    private String tipoCombustivel;

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", tipoCombustivel=" + tipoCombustivel + '}';
    }
}
