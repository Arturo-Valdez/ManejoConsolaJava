import java.util.Random;
import java.util.Scanner;

public class EjercicioGeneradorID {
    public static void main(String[] args) {
        //Funcion consola dinamica y valores aleatorios Random
        Scanner consola = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** Generador ID ***");

        //Obtener datos del usuario
        System.out.print("\nIngresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellidos: ");
        var apellidos = consola.nextLine();
        System.out.print("Ingresa tu fecha de nacimiento (YYYY): ");
        var fechaNaciemiento = consola.nextLine();

        //Obtener un valor de 1 hasta 9999
        var ultimoValores = random.nextInt(9999) + 1;
        //Formato 4 dijitos
        var ultimoValoresRecolecta = String.format("%04d", ultimoValores);

        //elimina espacios inicio y fin, haz mayusculas, captura los valores char de 0 a 2
        var nombreRecolecta = nombre.trim().toUpperCase().substring(0,2);
        var apellidosRecolecta = apellidos.trim().toUpperCase().substring(0,2);
        //elimina espacios inicio y fin,  captura los valores char apartir de la posicion 2
        var fechaNacimientoRecolecta = fechaNaciemiento.trim().substring(2);

        //Expresion de Generador ID
        var generarID = new StringBuffer().append(nombreRecolecta).append(apellidosRecolecta).append(fechaNacimientoRecolecta).
                append(ultimoValoresRecolecta);

        var mensaje =String.format("""
                Datos de usuario\n
                Hola %s %s tu ID esta generado!!
                \nID Generado: %s
                Felicidades!
                """, nombre, apellidos,generarID);

        System.out.printf(mensaje);





    }
}
