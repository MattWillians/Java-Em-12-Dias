package encapsulamento;

public class FinanciamentoImobiliario {
    public Double valorImovel;
    public Integer entradaDePagamento;
    public Double scoreCliente;
    public Integer totalDeParcelas;

    private Double taxaDeJuros;

    

    private Double calculoTaxaJuros(){
        if (this.scoreCliente > 800) {
            taxaDeJuros = 0.3;
        } else if (this.scoreCliente <= 800 && scoreCliente > 600) {
            taxaDeJuros = 0.5;
        } else if (this.scoreCliente <= 600 && scoreCliente > 300) {
            taxaDeJuros = 0.9;
        } else {
            taxaDeJuros = 1.3;
        }
    }
}
