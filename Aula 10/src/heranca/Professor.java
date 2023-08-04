package heranca;

public class Professor extends Pessoa implements InterfacesPessoa{

    String disciplina;
    Double horas;

    public Professor(String nome, String sobrenome, Integer idade, String cpf, String disciplina, Double horas) {
        super(nome, sobrenome, idade, cpf);
        this.disciplina = disciplina;
        this.horas = horas;
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
        return String.format("Olá alunos, meu nome é %s e sou seu professor de %s", this.nome, this.disciplina);
    }
}
