package encapsulamento;

public class MainApp {
    public static void main(String[] args) {
        FinanciamentoImobiliario finanMobile = new FinanciamentoImobiliario(350000.00, 25000.00, 600, 120);
        System.out.println(finanMobile.valorImovel);
        System.out.println(finanMobile.calcularFinanciamento());
        System.out.println(finanMobile.getValorFinalImovel());
        System.out.printf("Valor de cada parcela: %.2f", finanMobile.valorDasParcelas());
    }
}
