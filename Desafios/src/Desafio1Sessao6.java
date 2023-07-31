import java.util.Scanner;

public class Desafio1Sessao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double valorDoLitro = input.nextDouble();
        Double valorTotal;

        for (int quantidadeDeLitros = 1; quantidadeDeLitros < 50; quantidadeDeLitros++) {
            valorTotal = valorDoLitro * quantidadeDeLitros;
            System.out.println("| Numero De Litros: "+quantidadeDeLitros+" | Valor do Litro: "+valorDoLitro+" | Valor Total do Litro: "+valorTotal+" |");
        }

        input.close();
    }
}
