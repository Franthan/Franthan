package ProyectoVentas;

import java.util.ArrayList;

public class GestorVentas {
    private ArrayList<Venta> ventas = new ArrayList<>();

    public void agregarVenta(Venta v) {
        ventas.add(v);
    }

    public void mostrarVentas() {
        System.out.println("--- Ventas Registradas ---");
        for (Venta v : ventas) {
            System.out.println(v.getProducto().getNombre() + " x" + v.getCantidad() + " - Cliente: " + v.getCliente().getNombre());
        }
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Venta v : ventas) {
            total += v.getProducto().getPrecio() * v.getCantidad();
        }
        return total;
    }
}
