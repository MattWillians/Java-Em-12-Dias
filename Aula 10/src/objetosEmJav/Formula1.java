package objetosEmJav;

public class Formula1 { //Criamos a classe formula1 e adicionamos as caracteristicas dela

    //Essas são suas caracteristicas...
    String nomeDoCarro;
    Integer velocidadeMaxima;
    Integer velocidadeAtual;
    String corDoCarro;
    
    Formula1(String nomeDoCarro, Integer velocidadeMaxima, Integer velocidadeAtual, String corDoCarro) {//dizemos que, para USARMOS essa classe, precisamos obrigatóriamente, preencher estes campos.
        this.nomeDoCarro = nomeDoCarro;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.corDoCarro = corDoCarro;
    }

    public void sobreFormula1(){
        System.out.println("Nome deste Carro: "+nomeDoCarro+"\nVelocidade maxima: "+velocidadeMaxima+" | Velocidade Atual: "+velocidadeAtual+"\nCor do carro: "+corDoCarro);
    }

    public void acelerarCarro(){ // podemos criar métodos para usar no nosso programa
        this.velocidadeAtual += 10;
    }
}
