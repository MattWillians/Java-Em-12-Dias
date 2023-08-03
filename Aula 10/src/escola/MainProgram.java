package escola;

import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) throws Exception{

        ArrayList<Aluno> alunosEscola = new ArrayList<Aluno>();
        
        String[] primeiroNome = {"John", "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Robin"};
        String[] ultimoNome = {"Doe", "Smith", "Johnson", "Williams", "Jones", "Brown", "Hood"};
        Integer[] idades = {16, 17, 14, 19, 15, 13, 18};

        for (int i = 0; i < idades.length; i++) {
           alunosEscola.add(new Aluno(primeiroNome[i], ultimoNome[i], idades[i]));  
        } 

        for (int i = 0; i < idades.length; i++) {
            alunosEscola.get(i).saudarAluno();
        }
    }
}
