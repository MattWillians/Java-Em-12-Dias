package petshop;
public class MainApp {
    public static void main(String[] args) throws Exception {
        
        Usuarios usuarios = Usuarios.getInstance();
        Login login = Login.getInstanciaLogin();
        
        usuarios.createUsuario("Matheus", "112233", "12345678", "adm");
        login.exibeLogin();
    }
}
