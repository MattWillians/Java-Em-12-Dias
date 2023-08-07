package petshop;

import java.util.ArrayList;

// Cadastro dos usuarios. Colocamos "FINAL" para dizer que esta classe é constante e seus valores tambem.
public final class Usuarios  {

    //Dizemos que os usuarios são estaticos e imodificaveis
    private static Usuarios instanciaDeUsuarios;
    //Criamos uma lista de usuarios
    private ArrayList<Usuario> usuarios;

    //Função que instancia um novo array de funcionarios.
    public Usuarios() {
        this.usuarios = new ArrayList<>();
    }

    //Função que retorna a lista de usuarios
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    //Essa função verifica se já existe uma lista de usuarios, caso ja exista, ela não cria uma nova! É apenas uma forma de evitar que apaguemos os dados anteriores!!
    public static Usuarios getInstance() {
        if (instanciaDeUsuarios == null) {
            instanciaDeUsuarios = new Usuarios();
        }
        return instanciaDeUsuarios;
    }

    //retorna em qual posição esta o usuario que procuramos
    private Integer indexOfUser(String matricula){
        for (Integer i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getMatricula().equals(matricula)) {
                return i;
            }
        }
        return -1;
    }

    //Cria um usuario na base, usando suas caracteristicas como base.
    public void createUsuario(String nome, String matricula, String senha, String tipo){
        usuarios.add(new Usuario(nome, matricula, senha, tipo));
        System.out.println("Novo usuario adicionado na base: "+nome+"\n");
    }

    //Deleta os usuarios baseados na sua matricula
    public void deleteUsuario(String matricula) {
        Integer indexDoUser = this.indexOfUser(matricula);

        if (indexDoUser != -1) {
            Usuario usuarioRemovido = usuarios.get(indexDoUser);
            usuarios.remove(usuarioRemovido);
            System.out.println("Usuario removido com sucesso.\n");
        } else {
            System.out.println("Usuario não encontrado.\n");
        }
    }

    public Usuario verificarCredenciaisUsuario(String matricula, String senha){
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getMatricula().equals(matricula)) {
                if (usuarios.get(i).getSenha().equals(senha)) {
                    return usuarios.get(i);
                } else {
                    System.out.println("Senha incorreta, tente novamente.");
                }
            }
        }
        return null;
    }
} 

