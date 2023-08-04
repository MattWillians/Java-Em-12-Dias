package heranca;

public class Pessoa {
    public String nome;   
    public String sobrenome;
    public Integer idade;
    private String cpf;
    
    public Pessoa(String nome, String sobrenome, Integer idade, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
