import java.util.ArrayList;

public class PrintandoArrays {
    public static void main(String[] args) {
        ArrayList<String> arrayDeTexto = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            arrayDeTexto.add(("Objeto numero "+i));
        }
        System.out.println("\n\n");
        for (String string : arrayDeTexto) {
            System.out.println(string);
        }
    }
}
