public class IfElse {
    public static void main(String[] args) throws Exception {
        Integer idade = 19;
        Boolean autorizacaoDeSaida = true;

        if (idade >= 16 && autorizacaoDeSaida) {
            System.out.println("Aluno autorizado a deixar a escola sozinho");
        } else {
            System.out.println("Aluno NAO autorizado a deixar a escola sozinho");
        }
    }
}
