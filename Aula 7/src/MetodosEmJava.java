public class MetodosEmJava {
    public static void main(String[] args) throws Exception {
        System.out.println("a soma de 2 numeros: "+ soma(1,4));
        System.out.printf("A media de 3 numeros: %.2f", mediaDe3Numeros(5.0,8.0,10.0));
    }
    
    public static int soma(Integer a, Integer b){
        return a+b;
    }

    public static Double mediaDe3Numeros(Double a, Double b, Double c){
        return (a + b + c)/3;
    }

}
