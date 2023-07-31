public class Desafio2Sessao5 {
    public static void main(String[] args) {
        Double tempoCorredor1 = 35.5;
        Double tempoCorredor2 = 37.4;
        Double tempoCorredor3 = 32.1;

        System.out.println("O menor tempo percorrido foi de: "+ Math.min(Math.min(tempoCorredor1, tempoCorredor2), tempoCorredor3));
    }
}
