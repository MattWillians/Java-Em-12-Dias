public class IfElseEncadeado {
    public static void main(String[] args) {

        Double notaMatematicaBimestre1 = 10.0; 
        Double notaMatematicaBimestre2 = 6.5; 
        Double notaMatematicaBimestre3 = 8.0; 
        Double notaMatematicaBimestre4 = 4.0;

        Double media = (notaMatematicaBimestre1+notaMatematicaBimestre2+notaMatematicaBimestre3+notaMatematicaBimestre4)/4; 

        if (media >= 7) {
            System.out.println("O aluno foi aprovado para o proximo bimestre.");
        } else if (media < 7 && media >= 5) {
            System.out.println("O aluno deve realizar uma prova para recuperação de nota");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
}