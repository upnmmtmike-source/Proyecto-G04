import java.util.ArrayList;

/**
 * Pregunta 3: Colecciones (ArrayList)
 * Manejo de una lista de nombres de estudiantes
 */
public class ListaEstudiantes {
    
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> estudiantes = new ArrayList<>();
        
        System.out.println("=== GESTIÓN DE ESTUDIANTES ===\n");
        
        // Agregar 5 nombres de estudiantes
        estudiantes.add("Carlos Pérez");
        estudiantes.add("María González");
        estudiantes.add("Juan Rodríguez");
        estudiantes.add("Ana Martínez");
        estudiantes.add("Luis Fernández");
        
        // Mostrar la lista completa
        System.out.println("Lista completa de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        
        // Eliminar el tercer nombre (índice 2, porque empieza en 0)
        System.out.println("\n--- Eliminando el tercer estudiante ---");
        String eliminado = estudiantes.remove(2);
        System.out.println("Estudiante eliminado: " + eliminado);
        
        // Recorrer la lista nuevamente e imprimir nombres restantes
        System.out.println("\nLista actualizada de estudiantes:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        
        // Forma alternativa de recorrer (for-each)
        System.out.println("\n--- Usando for-each ---");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}

/*
 * EXPLICACIÓN:
 * - ArrayList<String>: lista dinámica que puede crecer o reducirse
 * - add(): agrega elementos al final de la lista
 * - get(index): obtiene el elemento en la posición especificada
 * - remove(index): elimina y retorna el elemento en esa posición
 * - size(): retorna el número de elementos en la lista
 * - Los índices empiezan en 0, por eso el tercer elemento está en índice 2
 */