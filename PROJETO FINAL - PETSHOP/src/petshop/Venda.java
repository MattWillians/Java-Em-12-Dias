package petshop;

public class Venda {
    
    private Double valor;
    private String formaPagamento;
    private String matriculaVendedor;
    
    public Venda(Double valor, String formaPagamento, String matriculaVendedor) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.matriculaVendedor = matriculaVendedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getMatriculaVendedor() {
        return matriculaVendedor;
    }

    public void setMatriculaVendedor(String matriculaVendedor) {
        this.matriculaVendedor = matriculaVendedor;
    }

}
