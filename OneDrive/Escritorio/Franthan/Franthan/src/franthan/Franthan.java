package franthan;

import franthan.usuarios.UsuarioManager;

public class Franthan {
    public static void main(String[] args) {
        UsuarioManager um = new UsuarioManager();
        um.registrarUsuario("Francesco");
        um.registrarUsuario("Ana", "admin");
        um.mostrarUsuario(0);
        um.mostrarUsuario(5);  // provocará error
        um.listarUsuarios();
    }
}
