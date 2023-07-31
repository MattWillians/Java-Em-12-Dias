import java.util.Scanner;

public class Desafio2Sessao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double temperaturaDigitada;
        Double somatoriaDeTemperaturas = 0.0;
        Double totalDeTemperatura = 0.0;
        Double mediaDeTemperaturas;

        do {

            System.out.println("Digite uma temperatura, ou digite 0 para finalizar");
            temperaturaDigitada = input.nextDouble();

            somatoriaDeTemperaturas += temperaturaDigitada;
            totalDeTemperatura += 1;

        } while (temperaturaDigitada != 0);
        
        mediaDeTemperaturas = (somatoriaDeTemperaturas / totalDeTemperatura);
        System.out.printf("A temperatura media do local e: %.2f", mediaDeTemperaturas);
        
        input.close();
    }
}
