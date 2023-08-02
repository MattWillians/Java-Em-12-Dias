import java.util.*;

public class CriandoUmArray {
    public static void main(String[] args) throws Exception {
        Integer[] arrayDeInteger = new Integer[10];//Declaramos um VETOR, que tem um tamanho limite de 10... ou seja, mais que 10 elementos não serão adicionados.
        
        System.out.println(Arrays.toString(arrayDeInteger));
        for (int i = 0; i < arrayDeInteger.length; i++) {
            arrayDeInteger[i] = i;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arrayDeInteger));

        ArrayList<Integer> listaDeInteiros = new ArrayList<Integer>(); // declaramos um ArrayList. Que pode receber quantos elementos necessarios
        
        System.out.println(listaDeInteiros.toString());
        for (int i = 0; i <= 100; i++) {
            listaDeInteiros.add(i, i);
        }
        System.out.println(listaDeInteiros.toString());

    }
    
}
