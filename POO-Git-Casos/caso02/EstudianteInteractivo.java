import java.util.Scanner;

class Estudiante {
    private String codigo;
    private String nombres;
    private int ciclo;
    private double promedio;

    public Estudiante() {}

    public Estudiante(String codigo, String nombres, int ciclo, double promedio) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.ciclo = ciclo;
        this.promedio = promedio;
    }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public int getCiclo() { return ciclo; }
    public void setCiclo(int ciclo) { this.ciclo = ciclo; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", ciclo=" + ciclo +
                ", promedio=" + promedio +
                '}';
    }
}

public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Ciclo (número): ");
        int ciclo = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Promedio (0-20): ");
        double promedio = Double.parseDouble(sc.nextLine().trim());

        Estudiante est = new Estudiante(codigo, nombres, ciclo, promedio);

        // Mostrar datos a través de getters
        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        System.out.println("Código: " + est.getCodigo());
        System.out.println("Nombres: " + est.getNombres());
        System.out.println("Ciclo: " + est.getCiclo());
        System.out.println("Promedio: " + est.getPromedio());

        // Modificar un campo para evidenciar set()
        System.out.print("\n¿Deseas actualizar el promedio? (s/n): ");
        String r = sc.nextLine().trim().toLowerCase();
        if (r.equals("s")) {
            System.out.print("Nuevo promedio: ");
            double nuevo = Double.parseDouble(sc.nextLine().trim());
            est.setPromedio(nuevo);
        }

        System.out.println("\nObjeto final: " + est);
        sc.close();
    }
}
