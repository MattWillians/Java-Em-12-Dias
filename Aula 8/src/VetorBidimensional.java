public class VetorBidimensional {
    public static void main(String[] args) {
        String arrayBidimensional[][] = new String[2][4];
        arrayBidimensional[0][0] = "Testando Carros";
        arrayBidimensional[0][1] = "Testando Motos";
        arrayBidimensional[0][2] = "Testando Barcos";
        arrayBidimensional[0][3] = "Testando Aviões";

        arrayBidimensional[1][0] = "Testando Cavalos";
        arrayBidimensional[1][1] = "Testando Cachorros";
        arrayBidimensional[1][2] = "Testando Eguas";
        arrayBidimensional[1][3] = "Testando Vacas";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(arrayBidimensional[i][j]);
            }
        }

    }
}
