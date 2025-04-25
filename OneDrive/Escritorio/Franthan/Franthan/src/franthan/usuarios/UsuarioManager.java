package franthan.usuarios;

import java.util.ArrayList;

public class UsuarioManager {
    private ArrayList<String> usuarios;

    public UsuarioManager() {
        usuarios = new ArrayList<>();
    }

    // Sobrecarga de métodos
    public void registrarUsuario(String nombre) {
        usuarios.add(nombre);
    }

    public void registrarUsuario(String nombre, String tipo) {
        usuarios.add(nombre + " (" + tipo + ")");
    }

    // Manejo de errores
    public void mostrarUsuario(int indice) {
        try {
            System.out.println("Usuario: " + usuarios.get(indice));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
    }

    // Uso de colecciones
    public void listarUsuarios() {
        for (String u : usuarios) {
            System.out.println(u);
        }
    }
}
