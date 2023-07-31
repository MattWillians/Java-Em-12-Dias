package pacoteEscola;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Double notaDigitada;
        Double notaFinal = 0.0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a "+i+" nota: ");
            notaDigitada = input.nextDouble();
            notaFinal += notaDigitada;
        }

        System.out.println("Media do aluno: "+ notaFinal/4);
        input.close();
    }
}
