package com.aplicacaoescola;

public class MenuPrincipal {
    public static void main(String[] args) {
        String nome = "Matheus";
        String sobrenome = "Willians";
        Integer idade = 19;

        String nomePai = "Wilson";
        String nomeMae = "Maria";
        
        Boolean autorizadoSaida = true;
        final String matricula = "RA432452345";

        System.out.println("\nNome & Sobrenome: "+nome+" "+sobrenome+"\nIdade do aluno: "+idade+"\nNome da mãe: "+nomeMae+" | Nome do pai: "+nomePai+"\nNumero da matricula: "+matricula);
        if (autorizadoSaida) {
            System.out.println("\nO aluno tem autorização de sair da escola sozinho.\n");
        } else {
            System.out.println("\nO aluno não tem autorização de saida sem acompanhante.\n");
        }
    }
}
