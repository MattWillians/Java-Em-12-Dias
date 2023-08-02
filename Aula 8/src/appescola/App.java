package appescola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> paisResponsaveis = new ArrayList<>();
        System.out.println("Por favor, adicione 3 Responsaveis pelo aluno.");
        for (int i = 0; i <= 2; i++) {
            paisResponsaveis.add(i, adicionarAluno(input, i));
        }
        System.out.println("Pais / responsaveis: "+ paisResponsaveis.toString());

    }
    
    public static String adicionarAluno(Scanner input, Integer index){
        String nomeResponsavel;
        System.out.println("Digite o nome do: ["+index+"] responsavel:");
        nomeResponsavel = input.next();
        return nomeResponsavel;
    }
}
