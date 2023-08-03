import java.util.ArrayList;
import java.util.List;

public class MetodosArrayList {
    public static void main(String[] args) {
       
       List<String> nomesDeCarros = new ArrayList<>();
       
       nomesDeCarros.add("Ferrari Enzo");
       nomesDeCarros.add("Ford Focus");
       nomesDeCarros.add("Pajero Dakar");
       nomesDeCarros.add("Astra Sedan");

       System.out.println(nomesDeCarros.toString());
       System.out.println(nomesDeCarros.size());
       
       nomesDeCarros.set(0, "Ford Fiesta");
       nomesDeCarros.set(3, "Pajero Full");

       System.out.println(nomesDeCarros.toString());

       nomesDeCarros.remove(0);

       System.out.println(nomesDeCarros.toString());
       System.out.println(nomesDeCarros.size());

    }
}
