import java.util.Scanner;
public class Desafio1Sessao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer classificacao = 0;
        String resposta;

        for (int indexPergunta = 1; indexPergunta < 6; indexPergunta++) {
            resposta = perguntas(indexPergunta, input);
            classificacao += classificar(resposta);
            System.out.println(classificacao);
        }
        acusar(classificacao);
        input.close();
    }

    public static String perguntas(Integer indicePergunta, Scanner input){ 
        
        String resposta;
        switch (indicePergunta) {
            case 1:
                System.out.println("Já trabalhou para a vitima?");
                resposta = input.next();
                return resposta;
            case 2:
                System.out.println("Esteve no local do crime?");
                resposta = input.next();
                return resposta;
            case 3:
                System.out.println("Devia para a Vitima?");
                resposta = input.next();
                return resposta;
            case 4:
                System.out.println("Mora perto da vitima?");
                resposta = input.next();
                return resposta;
            case 5:
                System.out.println("Telefonou para a vitima?");
                resposta = input.next();
                return resposta;
            default:
                System.out.println("não sera retornado nada, erro no Loop");
                return "N";
        } 
    }
    public static Integer classificar(String resposta){
        if (resposta.toLowerCase().equals("s")) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void acusar(Integer classificacao){
        if (classificacao >= 5) {
            System.out.println("O JUIZADO DECIDIU QUE O ACUSADO E: ASSASINO");
        } else if (classificacao >= 3 && classificacao < 5){
            System.out.println("O JUIZADO DECIDIU QUE O ACUSADO E: CUMPLICE");
        } else if (classificacao == 2){
            System.out.println("O JUIZADO DECIDIU QUE O ACUSADO E: SUSPEITO");
        } else {
            System.out.println("O JUIZADO DECIDIU QUE O ACUSADO E: INOCENTE");
        }
    }
}
