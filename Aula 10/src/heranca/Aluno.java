package heranca;

public class Aluno extends Pessoa implements InterfacesPessoa{

    public String serie;
    public String turma;

    public Aluno(String nome, String sobrenome, Integer idade, String cpf, String serie, String turma) {
        super(nome, sobrenome, idade, cpf);
        this.serie = serie;
        this.turma = turma;
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String saudacao() {
        
        return String.format("Olá professor, me chamo %s e estou na serie %s", this.nome, this.serie);
    }

}
