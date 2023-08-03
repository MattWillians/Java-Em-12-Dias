package appescola;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeResponsaveis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decisao;


        ArrayList<String> responsaveis = new ArrayList<>();
        
        do {
            System.out.print("O que deseja fazer?\n1 - Adicionar um Responsavel\n2 - Listar Responsaveis\n3 - Editar Responsaveis\n4 - Remover Responsavel\nDigite 'n' para sair do sistema.\n>>>");
            decisao = input.next();

            if (decisao.toLowerCase().equals("1")){
                adicionarResponsavel(responsaveis, input);

            } else if (decisao.toLowerCase().equals("2")) {// LISTA DE RESPONSAVEIS
                listarResponsaveis(responsaveis);
            
            } else if (decisao.toLowerCase().equals("3")) {  // EDITAR NOMES DE RESPONSAVEIS
                editarResponsaveis(responsaveis, input);
     
            } else if (decisao.toLowerCase().equals("4")) { // REMOVER O RESPONSAVEL
                removerResponsaveis(responsaveis);

            } else if (decisao.toLowerCase().equals("n")) {
                System.out.println("Finalizando sessao...");
            
            } else {
                System.out.println("Opcao inexistente");
            }

        } while (!decisao.toLowerCase().equals("n"));
        
    }

    public static void adicionarResponsavel(ArrayList<String> responsaveis, Scanner input){
        System.out.print("Digite o nome do responsavel que vamos adicionar: ");
        String responsavel = input.next();

        responsaveis.add(responsavel);
        System.out.println("Responsavel adicionado.\n");
    }

    public static void listarResponsaveis(ArrayList<String> responsaveis){
        for (Object responsavel : responsaveis) {
            System.out.println("+-------"+"-".repeat(responsavel.toString().length())+"-+");// 
            System.out.println("| Nome: "+responsavel+" |");
            System.out.println("+-------"+"-".repeat(responsavel.toString().length())+"-+");// 
        }
    }

    public static void editarResponsaveis(ArrayList<String> responsaveis, Scanner input){
        
        System.out.print("Digite o nome do responsavel a editar: ");
        String nomeOriginal = input.next();
        System.out.print("\nDigite o novo nome para: "+nomeOriginal+": ");
        String responsavelEditado = input.next();
        
        try {
            responsaveis.set(responsaveis.indexOf(nomeOriginal), responsavelEditado);
            System.out.println("Nome anterior: "+nomeOriginal+" | Nome atual: "+responsavelEditado);
        } catch (Exception e) {
            System.out.println("Responsavel Nao encontrado...\n");
        }
    }

    public static void removerResponsaveis(ArrayList<String> responsaveis){
        System.out.println("Foi removido o responsavel: "+responsaveis.toString().indexOf(responsaveis.size()));
        responsaveis.remove(responsaveis.size() -1);
    }


}
