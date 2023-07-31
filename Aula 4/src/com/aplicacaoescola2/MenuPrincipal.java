package com.aplicacaoescola2;


public class MenuPrincipal 
{
    public static void main(String[] args) 
    {
        Double notaMatematicaBimestre1 = 10.0; 
        Double notaMatematicaBimestre2 = 6.5; 
        Double notaMatematicaBimestre3 = 8.0; 
        Double notaMatematicaBimestre4 = 4.0;

        Double mediaMatematica = (notaMatematicaBimestre1+notaMatematicaBimestre2+notaMatematicaBimestre3+notaMatematicaBimestre4)/4;

        if (mediaMatematica >= 7) {
            System.out.println("Você passou de ano, com média: "+mediaMatematica);
        } else if (mediaMatematica < 7 && mediaMatematica >= 5){
            System.out.println("Aluno tera de fazer recuperacao.");
        } else {
            System.out.println("Você não passou de ano, com média: "+mediaMatematica);
        }

    }
}
