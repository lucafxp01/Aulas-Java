package com.mycompany.aula20250314exemploaluno;

public class Aula20250314ExemploAluno {

    public static void main(String[] args) {
        
        System.out.println("Exemplo Alunos");
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Cassio", "CC", "CC1M", 1, 8, 9);
        
        System.out.println(a2.getMatricula());
        a2.imprimir();
        System.out.println(a2);
        
        
    }
}
