package ProyectoVentas;

public class Venta {
    private Producto producto;
    private Cliente cliente;
    private int cantidad;

    public Venta(Producto producto, Cliente cliente, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public void realizarVenta() {
        try {
            producto.reducirStock(cantidad);
            System.out.println("Venta realizada a " + cliente.getNombre());
        } catch (Exception e) {
            System.out.println("Error en la venta: " + e.getMessage());
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
