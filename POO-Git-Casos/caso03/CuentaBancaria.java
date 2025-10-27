import java.util.Scanner;

class CuentaBancariaCore {
    private String titular;
    private String numero;
    private double saldo;

    public CuentaBancariaCore(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public String getNumero()  { return numero;  }
    public double getSaldo()   { return saldo;   }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser positivo.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes. Saldo actual: " + saldo);
        }
        saldo -= monto;
    }
}

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Número de cuenta: ");
        String numero = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = Double.parseDouble(sc.nextLine().trim());

        CuentaBancariaCore cuenta = new CuentaBancariaCore(titular, numero, saldoInicial);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine().trim());

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo: " + cuenta.getSaldo());
                        break;
                    case 2:
                        System.out.print("Monto a depositar: ");
                        double dep = Double.parseDouble(sc.nextLine().trim());
                        cuenta.depositar(dep);
                        System.out.println("Depósito exitoso. Nuevo saldo: " + cuenta.getSaldo());
                        break;
                    case 3:
                        System.out.print("Monto a retirar: ");
                        double ret = Double.parseDouble(sc.nextLine().trim());
                        cuenta.retirar(ret);
                        System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());
                        break;
                    case 0:
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } while (opcion != 0);

        sc.close();
    }
}
