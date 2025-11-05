
import java.util.ArrayList;

/**
 * Pregunta 4: Integrando conceptos
 * Sistema de inventario con sobrecarga y manejo de errores
 */

// Clase para representar un producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    // Constructor completo
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return String.format("Producto: %s | Precio: S/%.2f | Cantidad: %d", 
                             nombre, precio, cantidad);
    }
}

// Clase principal de inventario
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        productos = new ArrayList<>();
    }
    
    // Método sobrecargado 1: solo nombre (precio y cantidad por defecto)
    public void agregarProducto(String nombre) {
        try {
            Producto producto = new Producto(nombre, 0.0, 0);
            productos.add(producto);
            System.out.println("✓ Producto agregado: " + nombre);
        } catch (Exception e) {
            System.out.println("✗ Error al agregar producto: " + e.getMessage());
        }
    }
    
    // Método sobrecargado 2: nombre y precio (cantidad por defecto)
    public void agregarProducto(String nombre, double precio) {
        try {
            // Validar que el precio no sea negativo
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            
            Producto producto = new Producto(nombre, precio, 0);
            productos.add(producto);
            System.out.println("✓ Producto agregado: " + nombre + " - S/" + precio);
            
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("✗ Error al agregar producto: " + e.getMessage());
        }
    }
    
    // Método sobrecargado 3: nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            // Validar que el precio no sea negativo
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            
            // Validar que la cantidad no sea negativa
            if (cantidad < 0) {
                throw new IllegalArgumentException("La cantidad no puede ser negativa");
            }
            
            Producto producto = new Producto(nombre, precio, cantidad);
            productos.add(producto);
            System.out.println("✓ Producto agregado: " + nombre + 
                             " - S/" + precio + " - Cantidad: " + cantidad);
            
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("✗ Error al agregar producto: " + e.getMessage());
        }
    }
    
    // Método para mostrar todos los productos
    public void mostrarInventario() {
        System.out.println("\n=== INVENTARIO COMPLETO ===");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
        }
        System.out.println("Total de productos: " + productos.size() + "\n");
    }
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        System.out.println("=== SISTEMA DE INVENTARIO ===\n");
        
        // Usando método con solo nombre
        inventario.agregarProducto("Laptop");
        
        // Usando método con nombre y precio
        inventario.agregarProducto("Mouse", 25.50);
        
        // Usando método con nombre, precio y cantidad
        inventario.agregarProducto("Teclado", 45.99, 15);
        inventario.agregarProducto("Monitor", 299.99, 8);
        
        // Intentando agregar productos con valores inválidos
        System.out.println("\n--- Probando validaciones ---");
        inventario.agregarProducto("Producto Inválido", -50.0); // Precio negativo
        inventario.agregarProducto("Otro Inválido", 100.0, -5); // Cantidad negativa
        
        // Mostrar inventario completo
        inventario.mostrarInventario();
    }
}

/*
 * EXPLICACIÓN:
 * - Tres métodos sobrecargados con diferentes parámetros
 * - Validación de valores negativos usando IllegalArgumentException
 * - try-catch para manejar errores de validación
 * - ArrayList para almacenar los productos
 * - Clase Producto separada para mejor organización
 */