package com.mycompany.aula20250321;

public class Motorista {
    private String nome;
    private String cnh;
    private static int contMotorista = 0;
    
    public Motorista() {
        contMotorista++;
    }

    public static int getContMotorista() {
        return contMotorista;
    }
    
    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        contMotorista++;
    }

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", cnh=" + cnh + '}';
    }
    
    
}
