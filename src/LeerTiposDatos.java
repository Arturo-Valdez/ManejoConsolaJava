import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos

        //Leer un tipo int / NO RECOMENDABLE
        //var consola = new Scanner(System.in);
        //System.out.print("Ingresa tu edad: ");
        //var edad = consola.nextInt();
        //System.out.println("edad = " + edad);

        
        //Leer un tipo double / NO RECOMENDABLE
        //System.out.print("Ingresa tu altura: ");
        //var altura = consola.nextDouble();
        //System.out.println("altura = " + altura);

        //Consumir el caracter de salto de linea
        //consola.nextLine();

        //Leer un tipo int por conversion de datos / RECOMENDADO
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);


        //Leer un tipo Double por conversion de datos / RECOMENDADO
        System.out.print("Ingresa tu altura: ");
        var altura = Double.parseDouble(consola.nextLine());
        System.out.println("altura = " + altura);

        //Leer un tipo Flotante por conversion de datos / RECOMENDADO
        System.out.print("Ingresa valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);


        //Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
