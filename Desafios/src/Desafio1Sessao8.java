import java.util.*;

public class Desafio1Sessao8 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Random random = new Random();

        Integer aprovados = 0, emExame = 0, reprovados = 0;

        for (int i = 0; i < 50; i++) {
            notas.add(random.nextInt(10));
        }
        
        for (Integer nota : notas) {
            if (nota > 7){
                aprovados++;
            } else if (nota < 7 && nota > 5){
                emExame++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Total de alunos Aprovados: "+aprovados+"\nTotal de alunos em exame: "+emExame+"\nTotal de alunos reprovados: "+reprovados);
    }
}
