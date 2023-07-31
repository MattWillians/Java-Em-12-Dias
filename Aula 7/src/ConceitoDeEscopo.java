public class ConceitoDeEscopo {
    public static void main(String[] args) {
        
        String nome = "Joao";
        saudacao(nome);
    }
    public static void saudacao(String nomeAluno){
        String nome = "Jessica";//Mesmo nome do Joao, mas eles não podem serem duplicados, pois são de escopos diferentes
        System.out.println("A Professora: "+nome+", Ira assistir o aluno: "+nomeAluno);

    }

}