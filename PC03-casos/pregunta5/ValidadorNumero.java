import java.util.Scanner;

/**
 * Pregunta 5: Manejo de múltiples excepciones
 * Programa con excepción personalizada para números negativos
 */

// Clase de excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ValidadorNumero {
    
    // Método que valida si el número es negativo
    public static void validarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("No se permiten números negativos. Valor ingresado: " + numero);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            try {
                System.out.println("\n=== VALIDADOR DE NÚMEROS ===");
                System.out.print("Ingrese un número entero positivo (o 'salir' para terminar): ");
                
                String entrada = scanner.nextLine();
                
                // Permitir salir del programa
                if (entrada.equalsIgnoreCase("salir")) {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                
                // Intentar convertir la entrada a número
                int numero = Integer.parseInt(entrada);
                
                // Validar que no sea negativo
                validarNumero(numero);
                
                // Si llegamos aquí, el número es válido
                System.out.println("✓ Número válido: " + numero);
                System.out.println("  El doble del número es: " + (numero * 2));
                System.out.println("  El cuadrado del número es: " + (numero * numero));
                
            } catch (NumberFormatException e) {
                // Capturar cuando el usuario ingresa texto en lugar de número
                System.out.println("✗ Error: Debe ingresar un número entero válido.");
                System.out.println("  Intente nuevamente con valores numéricos (ejemplo: 5, 42, 100)");
                
            } catch (NumeroNegativoException e) {
                // Capturar la excepción personalizada de número negativo
                System.out.println("✗ Error: " + e.getMessage());
                System.out.println("  Por favor, ingrese solo números positivos o cero.");
                
            } catch (Exception e) {
                // Capturar cualquier otro error inesperado
                System.out.println("✗ Error inesperado: " + e.getMessage());
            }
        }
        
        scanner.close();
        System.out.println("\n¡Gracias por usar el validador de números!");
    }
}

/*
 * EXPLICACIÓN DETALLADA:
 * 
 * 1. EXCEPCIÓN PERSONALIZADA (NumeroNegativoException):
 *    - Extiende de Exception para crear nuestra propia excepción
 *    - Se usa cuando queremos lanzar errores específicos de nuestro negocio
 *    - El constructor recibe un mensaje personalizado
 * 
 * 2. NumberFormatException:
 *    - Excepción estándar de Java
 *    - Se lanza automáticamente cuando Integer.parseInt() recibe texto no numérico
 *    - Ejemplo: si el usuario escribe "abc" en lugar de un número
 * 
 * 3. MANEJO DE MÚLTIPLES EXCEPCIONES:
 *    - Varios bloques catch permiten manejar diferentes tipos de errores
 *    - El orden importa: las excepciones más específicas van primero
 *    - Cada catch puede mostrar un mensaje diferente según el error
 * 
 * 4. THROWS vs THROW:
 *    - throws: se declara en la firma del método (indica que puede lanzar excepciones)
 *    - throw: se usa dentro del método para lanzar la excepción
 * 
 * 5. FLUJO DEL PROGRAMA:
 *    - Se solicita un número al usuario
 *    - Se intenta convertir a entero (puede fallar con NumberFormatException)
 *    - Se valida que no sea negativo (puede lanzar NumeroNegativoException)
 *    - Si todo está bien, se procesa el número
 *    - Si hay error, se captura y se muestra mensaje apropiado
 */
