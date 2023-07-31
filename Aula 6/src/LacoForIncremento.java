public class LacoForIncremento {
    public static void main(String[] args) throws Exception {
        int o = 0;
        for (int i = 0; i < 51; i++) {
            o++;
            System.out.println(o);
            System.out.println(i+=1);
        }
    }
}
