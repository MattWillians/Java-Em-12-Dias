package petshop;

public class Vendedor extends Usuario implements IUsuario{

    public static Vendas vendas = Vendas.getInstanciaDeVendas();

    public Vendedor(String nome, String matricula, String senha) {
        super(nome, matricula, senha, "usr");
    }
    
    public void cadastrarVenda(Double valor, String formaPagamento, String matriculaVendedor){
        vendas.realizarVenda(valor, formaPagamento, matriculaVendedor);
    }
    
    public void gerarRelatorio(){
        vendas.gerarRelatorioPorMatricula(this.getMatricula());
    }
}
