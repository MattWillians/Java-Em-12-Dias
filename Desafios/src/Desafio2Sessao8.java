import java.util.Random;

public class Desafio2Sessao8 {
    public static void main(String[] args) {
        Double[] bancoDeHoras = new Double[20];
        
        Double horasMensais = 160.0;
        Double horasTrabalhadas = 0.0;

        Random random = new Random();

        for (int i = 0; i < bancoDeHoras.length; i++) {
            bancoDeHoras[i] = random.nextDouble(8);
        }

        for (Double horas : bancoDeHoras) {
            horasTrabalhadas += horas;
        }

        System.out.printf("Horas trabalhadas: %.2f\n", horasTrabalhadas);

        if (horasTrabalhadas < horasMensais) {
            System.out.printf("Voce deve repor: %.2f\n", (horasMensais - horasTrabalhadas));
        } else {
            System.out.println("Nao e necessario repor horas.");
        }
        
    }
}
