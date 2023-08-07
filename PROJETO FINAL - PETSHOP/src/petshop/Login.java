package petshop;

import java.util.Scanner;

public final class Login {


    Scanner input = new Scanner(System.in);
    
    public Usuarios usuarios = Usuarios.getInstance();
    private Usuario usuarioLogado;
    private static Login instanciaLogin;

    public void exibeLogin(){
        while (true) {
            System.out.println("+------------------------------");
            System.out.println("| Bem vindo ao PetShop do Matt ");
            System.out.println("|                              ");
            System.out.print("| Digite sua matricula: ");
            String matricula = input.next();
            System.out.println("|                              ");
            System.out.print("| Digite sua senha: ");
            String senha = input.next();
            System.out.println("|                              ");
            System.out.println("+------------------------------");
            Boolean retorno = realizarLogin(matricula, senha);

            if (retorno) {
                if(this.usuarioLogado.getTipo().equals("adm")){
                    
                    Gerente gerente = (Gerente) getUsuarioLogado();
                    
                    while (true) {
                        System.out.println("+===============================+");
                        System.out.println("|    <<< Menu Do Gerente >>>    |");
                        System.out.println("+-------------------------------+");
                        System.out.println("| 1 -> Cadastrar novo vendedor  |");
                        System.out.println("| 2 -> Remover um vendedor      |");
                        System.out.println("| 3 -> Relatorio por matricula  |");
                        System.out.println("| 4 -> Relatorio geral          |");
                        System.out.println("| 5 -> Realizar Logout          |");
                        System.out.println("+===============================+");
                        System.out.print("\n> > > ");
                        String opcao = input.next();
                        
                        if (opcao.equals("1")) {
                            System.out.print("\nDigite o nome do vendedor: ");
                            String nomeUsr = input.next();
                            System.out.print("\nDigite a matricula: ");
                            String matriculaUsr = input.next();
                            System.out.println("\nDigite a senha: ");
                            String senhaUsr = input.next();

                            gerente.cadastrarNovoUsuario(nomeUsr, matriculaUsr, senhaUsr);

                        } else if (opcao.equals("2")) {
                            System.out.print("Digite a matricula a ser exluida: ");
                            String matriculaRemover = input.next();
                            gerente.removerUsuario(matriculaRemover);

                        } else if (opcao.equals("3")) {
                            System.out.println("Digite a matricula para consulta:");
                            String matriculaRelatorio = input.next();
                            gerente.gerarRelatiorioPorMatricula(matriculaRelatorio);

                        } else if (opcao.equals("4")) {
                            gerente.gerarRelatorio();

                        } else if (opcao.equals("5")) {
                            setUsuarioLogado(null);
                            break;
                        } else {
                            System.out.println("Opcao inexistente, digite uma das opcoes do menu");
                        }
                    }
                } else {
                    
                    Vendedor vendedor = (Vendedor) getUsuarioLogado();

                    while (true) {
                        System.out.println("+===============================+");
                        System.out.println("|   <<< Menu Do Vendedor >>>    |");
                        System.out.println("+-------------------------------+");
                        System.out.println("| 1 -> Realizar Venda           |");
                        System.out.println("| 2 -> Exibir Relatorio         |");
                        System.out.println("| 3 -> Realizar Logout          |");
                        System.out.println("+===============================+");
                        System.out.print("\n> > > ");
                        String opcao = input.next();
                        
                        if (opcao.equals("1")) {
                            
                            System.out.print("Digite o valor do produto: ");
                            Double valor = input.nextDouble();
                            
                            System.out.print("Digite a forma de pagamento: ");
                            String formaPgm = input.next();

                            vendedor.cadastrarVenda(valor, formaPgm, vendedor.getMatricula());

                        } else if (opcao.equals("2")) {
                            vendedor.gerarRelatorio();


                        } else if (opcao.equals("3")) {
                            setUsuarioLogado(null);
                            break;
                        
                        } else {
                            System.out.println("Opcao inexistente, digite uma das opcoes do menu");
                        }
                    }
                }
            } 
        }
    }

    private Boolean realizarLogin(String matricula, String senha){
        Usuario usuario = usuarios.verificarCredenciaisUsuario(matricula, senha);
        if (usuario != null) {
            System.out.println("Usuario logado com sucesso!");
            this.usuarioLogado = usuario;
            return true;
        } else {
            System.out.println("Credenciais incorretas.");
            return false;
        }
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public static Login getInstanciaLogin() {
        if (instanciaLogin == null) {
            instanciaLogin = new Login();
        }
        return instanciaLogin;
    }

    

}
