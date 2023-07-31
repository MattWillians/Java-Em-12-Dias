import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            
            System.out.println("Digite o primeiro numero!");
            Integer number1 = input.nextInt();
            System.out.println("digite o segundo numero!");
            Integer number2 = input.nextInt();

            Integer result = (number1 + number2);
            
            if (result >= 100) {
                System.out.println("a conta somou + de 100.");
                break;
            } else {
                System.out.println("Tente novamente...");
                continue;
            }
        }
        input.close();
    }
}
