package objetosEmJav;

public class Sapato {
    Integer tamanho;
    String marca;
    Integer preco;
    String modelo;

    Sapato(Integer tamanho, String marca, Integer preco, String modelo) {
        this.tamanho = tamanho;
        this.marca = marca;
        this.preco = preco;
        this.modelo = modelo;
    }

    public void sobreSapato(){
        System.out.println("Informações deste sapato: ");
        System.out.println("| Marca: "+marca+" | Modelo: "+modelo);
        System.out.println("| Tamanho: "+tamanho+" | Preco: "+preco);
    }
    
}
