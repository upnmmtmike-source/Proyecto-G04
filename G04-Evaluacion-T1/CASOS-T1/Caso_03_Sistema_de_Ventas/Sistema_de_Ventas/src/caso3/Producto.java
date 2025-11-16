package caso3;

public class Producto {
private String nombre;
private double precio;
private int stock;

public Producto(String nombre, double precio, int stock) {
	this.nombre = nombre;
	this.precio = precio;
	this.stock = stock;
	}

	public String getNombre() {
		return nombre; 
		}
	public double getPrecio() { 
		return precio; 
		}
	public int getStock() { 
		return stock; 
		}

	public void disminuirStock(int cantidad) throws Exception {
		if (cantidad > stock) {
			throw new Exception("Stock insuficiente para " + nombre);
		}
		stock -= cantidad;
	}

	@Override
	public String toString() {
		return nombre + " | Precio: " + precio + " | Stock: " + stock;
	}
}



