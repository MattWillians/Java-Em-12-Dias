package escola;

public class Aluno {
    String nomeAluno;
    String sobrenomeAluno;
    Integer idadeAluno;

    public Aluno(String nomeAluno, String sobrenomeAluno, Integer idadeAluno) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.idadeAluno = idadeAluno;
    }

    public void saudarAluno(){
        System.out.println("\nBem vindo: "+(this.nomeAluno + " " + this.sobrenomeAluno)+" Tenha uma boa aula.\n");
    }
}
