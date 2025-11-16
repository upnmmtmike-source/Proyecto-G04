package Evaluable;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEstudianteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Estudiantes Registrados fijos
        Estudiante Mike = new EstudianteRegular("Mike Maca Tapullima", 35);
        Mike.agregarCurso(new Curso("Base de Datos Avanzada", 4, "Lunes y Miercoles 8:00 - 10:00", "Presencial", "Dr. Gonzales"));
        Mike.agregarCurso(new Curso("Inteligencia Artificial", 5, "Martes y Jueves 9:00 - 11:00", "Presencial", "Mg. Vargas"));
        Mike.agregarCurso(new Curso("Seguridad Informatica", 4, "Martes y Jueves 14:00 - 16:00", "Remoto", "Ing. Mendoza"));
        Mike.agregarCurso(new Curso("Arquitectura de Computadores", 5, "Viernes 8:00 - 12:00", "Presencial", "Dr. Silva"));
        Mike.agregarCurso(new Curso("Computacion en la Nube", 4, "Sabados 8:00 - 12:00", "Presencial", "Mg. Torres"));
        estudiantes.add(Mike);

        Estudiante Vladimir = new EstudianteBecado("Vladimir Giomar Caballero Rodríguez", 37, 0.5);
        Vladimir.agregarCurso(new Curso("Sistemas Distribuidos", 3, "Lun y Miercoles 11:00 - 13:00", "Remoto", "Dr. Paredes"));
        Vladimir.agregarCurso(new Curso("Desarrollo de Videojuegos", 4, "Martes y Jue 8:00 - 10:00", "Presencial", "Mg. Quispe"));
        Vladimir.agregarCurso(new Curso("Aprendizaje Automatico", 5, "Martes y Jue 16:00 - 18:00", "Remoto", "Dr. Ramírez"));
        Vladimir.agregarCurso(new Curso("Mineria de Datos", 5, "Viernes 14:00 - 18:00", "Presencial", "Ing. Campos"));
        Vladimir.agregarCurso(new Curso("Ingenieria de Software II", 5, "Sabados 8:00 - 12:00", "Presencial", "Mg. Santillán"));
        estudiantes.add(Vladimir);
        
        Estudiante Ketty = new EstudianteRegular("Ketty Limarez Ramirez", 25);
        Ketty.agregarCurso(new Curso("Fisica Computacional", 4, "Lun y Miercoles 9:00 - 11:00", "Presencial", "Dr. Navarro"));
        Ketty.agregarCurso(new Curso("Compiladores y Lenguajes", 3, "Martes y Jueves 8:00 - 9:30", "Presencial", "Mg. Soto"));
        Ketty.agregarCurso(new Curso("Robotica Industrial", 3, "Miercoles 14:00 - 16:00", "Remoto", "Ing. Herrera"));
        Ketty.agregarCurso(new Curso("Desarrollo de Software Movil", 4, "Viernes 10:00 - 12:00", "Presencial", "Dr. Medina"));
        Ketty.agregarCurso(new Curso("Analisis Numerico", 4, "Sabado 8:00 - 12:00", "Presencial", "Mg. Vega"));
        estudiantes.add(Ketty);
        
        Estudiante Leonel = new EstudianteBecado("Leonel Castillo Rios", 21, 0.5);
        Leonel.agregarCurso(new Curso("Teoria de la Computacion", 4, "Lun y Miercoles 8:00 - 10:00", "Presencial", "Dr. Fernández"));
        Leonel.agregarCurso(new Curso("Graficos por Computadora", 4, "Martes y Jueves 10:00 - 12:00", "Remoto", "Mg. Benítez"));
        Leonel.agregarCurso(new Curso("Computacion Cuantica", 4, "Miercoles 14:00 - 16:00", "Presencial", "Dr. Salazar"));
        Leonel.agregarCurso(new Curso("Internet de las Cosas", 4, "Viernes 8:00 - 10:00", "Presencial", "Ing. Delgado"));
        Leonel.agregarCurso(new Curso("Procesamiento de Imagenes", 4, "Sabado 9:00 - 13:00", "Presencial", "Mg. Aguirre"));
        estudiantes.add(Leonel);

        System.out.print("Desea registrar mas estudiantes? (s/n): ");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Cuantos estudiantes mas desea?: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cantidad; i++) {
                System.out.println("\nEstudiante " + (i + 1));
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Es becado? (s/n): ");
                String tipo = sc.nextLine();

                Estudiante nuevo;
                if (tipo.equalsIgnoreCase("s")) {
                    System.out.print("Porcentaje beca (0-100): ");
                    double porc = sc.nextDouble();
                    sc.nextLine();
                    nuevo = new EstudianteBecado(nombre, edad, porc / 100);
                } else {
                    nuevo = new EstudianteRegular(nombre, edad);
                }

                System.out.print("Cuantos cursos llevara?: ");
                int numCursos = sc.nextInt();
                sc.nextLine();

                for (int j = 0; j < numCursos; j++) {
                    System.out.println("Curso " + (j + 1));
                    System.out.print("Nombre del curso: ");
                    String nc = sc.nextLine();

                    System.out.print("Creditos: ");
                    int cr = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Horario: ");
                    String hor = sc.nextLine();

                    System.out.print("Modalidad: ");
                    String mod = sc.nextLine();

                    System.out.print("Docente: ");
                    String doc = sc.nextLine();

                    nuevo.agregarCurso(new Curso(nc, cr, hor, mod, doc));
                }

                estudiantes.add(nuevo);
            }
        }

        System.out.println("\n===== LISTA DE ESTUDIANTES =====");
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
            System.out.printf("Mensualidad: S/%.2f\n", e.calcularMensualidad());
            e.evaluar();
            System.out.println("---------------------");
        }

        sc.close();
    }
}