package franthan;

import franthan.usuarios.UsuarioManager; // ESTA LÍNEA DEBE IR AQUÍ ARRIBA

public class Franthan {
    public static void main(String[] args) {
        UsuarioManager um = new UsuarioManager();

        um.registrarUsuario("Francesco");
        um.registrarUsuario("Ana", "Administrador");

        um.mostrarUsuario(0);       // Muestra Francesco
        um.mostrarUsuario(5);       // Índice fuera de rango

        um.listarUsuarios();        // Muestra todos los usuarios
    }
}