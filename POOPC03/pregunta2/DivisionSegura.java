import java.util.Scanner;

/**
 * Pregunta 2: Manejo de Errores
 * Programa que realiza división con manejo de ArithmeticException
 */
public class DivisionSegura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== CALCULADORA DE DIVISIÓN ===");
            
            // Solicitar el primer número
            System.out.print("Ingrese el primer número (dividendo): ");
            int numero1 = scanner.nextInt();
            
            // Solicitar el segundo número
            System.out.print("Ingrese el segundo número (divisor): ");
            int numero2 = scanner.nextInt();
            
            // Intentar realizar la división
            int resultado = numero1 / numero2;
            
            System.out.println("\nResultado: " + numero1 + " / " + numero2 + " = " + resultado);
            
        } catch (ArithmeticException e) {
            // Capturar el error de división entre cero
            System.out.println("\nError: división entre cero no permitida");
            
        } catch (Exception e) {
            // Capturar otros posibles errores (como entrada no numérica)
            System.out.println("\nError: entrada inválida. Debe ingresar números enteros.");
            
        } finally {
            scanner.close();
        }
    }
}

/*
 * EXPLICACIÓN:
 * - try: contiene el código que puede generar errores
 * - catch (ArithmeticException): captura específicamente la división entre cero
 * - catch (Exception): captura cualquier otro error
 * - finally: se ejecuta siempre, ideal para cerrar recursos como el Scanner
 */
