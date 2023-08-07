package petshop;

import java.util.ArrayList;

public final class Vendas {
    
    private static Vendas instanciaDeVendas;
    public static Vendas getInstanciaDeVendas() {
        if(instanciaDeVendas == null){
            instanciaDeVendas = new Vendas();
        }
        return instanciaDeVendas;
    }

    ArrayList<Venda> vendas = new ArrayList<>();
    public Vendas() {
        this.vendas = new ArrayList<>();
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }
    
    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void realizarVenda(Double valor, String formaPagamento, String matriculaVendedor){
        vendas.add(new Venda(valor, formaPagamento, matriculaVendedor));
    }

    public void gerarRelatorio(){
        System.out.println("+-------------------------------->");
        System.out.println("| Relatorio de vendas do Petshop ");
        for (Venda venda : vendas) {
            System.out.printf("| Valor: %d / Forma de Pagamento: %s / Vendedor: %s", venda.getValor(), venda.getFormaPagamento(), venda.getMatriculaVendedor());
        }
        System.out.println("V");
    }

    public void gerarRelatorioPorMatricula(String matricula){
        System.out.println("+-------------------------------->");
        System.out.println("| Relatorio de vendas do Petshop ");
        for (Venda venda : vendas) {
            if (venda.getMatriculaVendedor().equals(matricula)){
                System.out.printf("| Valor: %d / Forma de Pagamento: %s / Vendedor: %s", venda.getValor(), venda.getFormaPagamento(), venda.getMatriculaVendedor());
            }
        }
        
    }
}
