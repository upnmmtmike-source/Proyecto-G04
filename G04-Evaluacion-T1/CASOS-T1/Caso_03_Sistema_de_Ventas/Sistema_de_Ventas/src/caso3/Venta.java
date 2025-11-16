package caso3;


public class Venta {
    private String nombreProducto;
    private int cantidad;
    private double total;

    public Venta(String nombreProducto, int cantidad, double total) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta - Producto: " + nombreProducto +
               ", Cantidad: " + cantidad +
               ", Total: " + total;
    }
}



