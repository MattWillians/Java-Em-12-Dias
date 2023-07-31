public class Desafio2Sessao4 {
    public static void main(String[] args) {
        Double notaMatematicaBimestre1 = 10.0; 
        Double notaMatematicaBimestre2 = 6.5; 
        Double notaMatematicaBimestre3 = 8.0; 
        Double notaMatematicaBimestre4 = 4.0;

        Double mediaMatematica = (notaMatematicaBimestre1+notaMatematicaBimestre2+notaMatematicaBimestre3+notaMatematicaBimestre4)/4;

        if (mediaMatematica >= 7) {
            System.out.println("Voce passou de ano, com media: "+mediaMatematica);
        } else {
            System.out.println("Voce nao passou de ano, com media: "+mediaMatematica);
        }
    }
}
