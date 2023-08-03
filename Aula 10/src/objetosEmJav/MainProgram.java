package objetosEmJav;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        
        ArrayList<Formula1> carros = new ArrayList<Formula1>(); //Criamos um Array de carros de F1, pois não sabemos quantos carros temos em uma competição...

        carros.add(new Formula1("Ferrari", 340, 229, "Vermelho")); // para adicionar uma nova classe, usamos simplesmente o metodo "new" e colocamos que estamos colocando uma nova F1
        carros.add(new Formula1("Maclaren", 330, 240, "Verde"));

        for (int i = 0; i < carros.size(); i++) {
            carros.get(i).acelerarCarro();
            carros.get(i).sobreFormula1();
        }

        ArrayList<Object> teste = new ArrayList<Object>();//Funciona, mas, não é possivel acessar os atributos ou métodos dos objetos... teremos de recuperar eles para usar, devido ao fato de que são diferentes.
        
        teste.add(new Formula1("Maclaren", 330, 240, "Verde"));
        teste.add(new Sapato(36, "Air Jordan", 340, "AirMax"));
        
        //para cada objeto que usamos, temos que declarar eles.
        Formula1 formula1 = (Formula1) teste.get(0);
        Sapato sapato = (Sapato) teste.get(1);

        sapato.sobreSapato();
        formula1.sobreFormula1();

    }
}
