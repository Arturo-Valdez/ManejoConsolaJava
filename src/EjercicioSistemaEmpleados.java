import java.util.Scanner;

public class EjercicioSistemaEmpleados {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Sisema de empleados ***");

        //Obtener datos
        System.out.print("Ingresa nombre del empleado: ");
        var strNombre = consola.nextLine();
        System.out.print("Ingresa edad: ");
        var intedad = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa salario: ");
        var dbleSalario = Double.parseDouble(consola.nextLine());
        System.out.print("Es jefe de departamento (true/false): ");
        var boolJefe = Boolean.parseBoolean(consola.nextLine());

        //Imprimir datos
        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + strNombre);
        System.out.println("\tEdad: " + intedad +" años");
        System.out.printf("\tSalario: $%.2f%n", dbleSalario);//metodo de formato %.2f%n para tomar solo 2 decimales
        System.out.println("\tEs jefe de departamento: " + boolJefe);

    }
}
