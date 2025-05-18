package ProyectoVentas;

public class Main {
    public static void main(String[] args) {
        GestorProducto gestorProducto = new GestorProducto();
        gestorProducto.agregarProducto(new Producto("Laptop", 3500, 5));
        gestorProducto.agregarProducto(new Producto("Mouse", 150, 10));

        Cliente cliente = new Cliente("Francesco Moreno", "12345678", "francesco@email.com");
        Venta venta = new Venta(gestorProducto.buscarProductoPorNombre("Laptop"), cliente, 1);
        venta.realizarVenta();

        GestorVentas gestorVentas = new GestorVentas();
        gestorVentas.agregarVenta(venta);
        gestorVentas.mostrarVentas();
        System.out.println("Total de ventas: S/ " + gestorVentas.calcularTotalVentas());
    }
}
