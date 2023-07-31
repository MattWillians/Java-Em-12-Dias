public class OperadorTernario {
    public static void main(String[] args) {
        Double notaMatematicaBimestre1 = 10.0; 
        Double notaMatematicaBimestre2 = 6.5; 
        Double notaMatematicaBimestre3 = 8.0; 
        Double notaMatematicaBimestre4 = 4.0;

        Double media = (notaMatematicaBimestre1+notaMatematicaBimestre2+notaMatematicaBimestre3+notaMatematicaBimestre4)/4; 

        System.out.println(media >= 7 ? "O aluno foi aprovado para o proximo bimestre." : "O aluno deve realizar uma prova para recuperacao de nota");//usamos operadores tenarios
    }
}
