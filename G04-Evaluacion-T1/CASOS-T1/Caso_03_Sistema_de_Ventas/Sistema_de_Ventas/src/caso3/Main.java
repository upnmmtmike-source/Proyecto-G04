package caso3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Venta> ventas = new ArrayList<>();

        // Productos de Ejemplos
        productos.add(new Producto("Parlantes", 300.0, 10));
        productos.add(new Producto("Mandos", 150.0, 5));
        productos.add(new Producto("Mouse", 70.0, 12));
        productos.add(new Producto("Teclado", 60.0, 8));
        productos.add(new Producto("Laptop", 2500.0, 10));
        productos.add(new Producto("Monitor", 700.0, 5));
        productos.add(new Producto("Impresora", 1200.0, 10));
        
        int opcion;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Stock Disponible");
            System.out.println("2. Comprar Productos");
            System.out.println("3. Ventas Realizadas");
            System.out.println("0. Salir");
            System.out.print("Elige: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("=== Stock Disponible ===");
                    for (Producto p : productos) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                	System.out.println("=== Comprar Productos ===");
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    boolean encontrado = false;
                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(nombre)) {
                            try {
                                p.disminuirStock(cantidad);
                                double total = p.getPrecio() * cantidad;
                                ventas.add(new Venta(p.getNombre(), cantidad, total));
                                System.out.println("Gracias por comprar!. (Total): " + total);
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Producto no encontrado, digitarlo correctamente por favor.");
                    break;

                case 3:
                    System.out.println("=== Ventas Realizadas ===");
                    for (Venta v : ventas) {
                        System.out.println(v);
                    }
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}

