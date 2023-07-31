public class SwitchCase {
    public static void main(String[] args) {

        String vagaEscolhida = "Ensino Fundamental";
        switch (vagaEscolhida) {
            case "Ensino Infantil 1":
                System.out.println("Vaga: Ensino Infantil 1\nSalario: R$ 4.000");
                break;
            case "Ensino Infantil 2":
                System.out.println("Vaga: Ensino Infantil 2\nSalario: R$ 5.000");
                break;
            case "Ensino Fundamental 1":
                System.out.println("Vaga: Ensino Fundamental 1\nSalario: R$ 6.000");
                break;
            case "Ensino Fundamental 2":
                System.out.println("Vaga: Ensino Fundamental 2\nSalario: R$ 7.000");
                break;
            case "Ensino Medio":
                System.out.println("Vaga: Ensino Medio\nSalario: R$ 8.000");
                break;
            default:
                System.out.println("Vaga nao encontrada");
                break;
        }
    }
}
