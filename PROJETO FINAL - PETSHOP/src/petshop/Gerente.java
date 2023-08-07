package petshop;

public class Gerente extends Usuario implements IUsuario{

    public static Vendas vendas = Vendas.getInstanciaDeVendas();
    public static Usuarios usuarios = Usuarios.getInstance();

    public Gerente(String nome, String matricula, String senha) {
        super(nome, matricula, senha, "adm");
        
    }

    public void cadastrarNovoUsuario(String nome, String matricula, String senha){
        usuarios.createUsuario(nome, matricula, senha, "usr");
    }

    public void removerUsuario(String matricula){
        usuarios.deleteUsuario(matricula);
    }
    
    public void gerarRelatorio(){
        vendas.gerarRelatorio();
    }

    public void gerarRelatiorioPorMatricula(String matricula){
        vendas.gerarRelatorioPorMatricula(matricula);
    }
}
