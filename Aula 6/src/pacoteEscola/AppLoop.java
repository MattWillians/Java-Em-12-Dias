package pacoteEscola;

import java.util.Scanner;

public class AppLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double notaDigitada;
        Double somaDasNotas = 0.0;
        Double totalDeNotas = 0.0;

        Double mediaDoAluno;

        while (true) {

            System.out.println("Digite uma nota, ou digite 0 para encerrar o programa.");
            notaDigitada = input.nextDouble();

            somaDasNotas += notaDigitada;

            if (notaDigitada != 0) {
                totalDeNotas++;
                continue;
            } else {
                System.out.println("Voce digitou Zero, encerrando programa");
                break;
            }
        }
        mediaDoAluno = somaDasNotas / totalDeNotas;
        System.out.println("A media do aluno foi de: "+mediaDoAluno);

        input.close();
    }
}
