package encapsulamento;

public class FinanciamentoImobiliario {

    public Double valorImovel;
    public Double entradaDePagamento;
    public Integer scoreCliente;
    public Integer totalDeParcelas;

    public FinanciamentoImobiliario(Double valorImovel, Double entradaDePagamento, Integer scoreCliente,
            Integer totalDeParcelas) {
        this.valorImovel = valorImovel;
        this.entradaDePagamento = entradaDePagamento;
        this.scoreCliente = scoreCliente;
        this.totalDeParcelas = totalDeParcelas;
    }

    private Double taxaDeJuros = 0.0;
    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    private Double jurosAplicados = 0.0;
    public Double getJurosAplicados() {
        return jurosAplicados;
    }

    private Double valorFinalImovel = 0.0;
    public Double getValorFinalImovel() {
        return valorFinalImovel;
    }


    public Double calcularFinanciamento(){
        this.jurosAplicados = (this.valorImovel - this.entradaDePagamento) * calculoTaxaJuros();
        this.valorFinalImovel = this.valorImovel + this.jurosAplicados;
        System.out.println(valorFinalImovel);
        return this.valorFinalImovel;
    }

    private Double calculoTaxaJuros(){
        if (this.scoreCliente > 800) {
            return this.taxaDeJuros = 0.3;
        } else if (this.scoreCliente <= 800 && scoreCliente > 600) {
            return this.taxaDeJuros = 0.5;
        } else if (this.scoreCliente <= 600 && scoreCliente > 300) {
            return this.taxaDeJuros = 0.9;
        } else {
            return this.taxaDeJuros = 1.3;
        }
    }

    public Double valorDasParcelas(){
        return this.valorFinalImovel / this.totalDeParcelas;
    }
}
