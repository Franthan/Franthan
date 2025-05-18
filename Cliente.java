package ProyectoVentas;

public class Cliente {
    private String nombre;
    private String dni;
    private String correo;

    public Cliente(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }
}
