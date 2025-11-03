/**
 * Pregunta 1: Sobrecarga de Métodos
 * Demostración de sobrecarga con diferentes parámetros
 */
public class Calculadora {
    
    // Método sobrecargado 1: suma dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Método sobrecargado 2: suma tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método sobrecargado 3: suma dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Demostrando el uso de los tres métodos sobrecargados
        System.out.println("=== CALCULADORA CON SOBRECARGA ===");
        
        // Usando método con dos enteros
        int resultado1 = calc.sumar(5, 3);
        System.out.println("Suma de dos enteros (5 + 3): " + resultado1);
        
        // Usando método con tres enteros
        int resultado2 = calc.sumar(5, 3, 2);
        System.out.println("Suma de tres enteros (5 + 3 + 2): " + resultado2);
        
        // Usando método con dos decimales
        double resultado3 = calc.sumar(5.5, 3.7);
        System.out.println("Suma de dos decimales (5.5 + 3.7): " + resultado3);
    }
}

/*
 * EXPLICACIÓN:
 * La sobrecarga de métodos permite tener varios métodos con el mismo nombre
 * pero diferentes parámetros (cantidad o tipo).
 * Java identifica cuál método usar basándose en los argumentos que pasamos.
 */
