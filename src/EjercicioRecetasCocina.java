import java.util.Scanner;

public class EjercicioRecetasCocina {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Recetas de Cocina ***");

        //Nombre de receta
        System.out.print("Ingresa nombre de receta: ");
        var strReceta = consola.nextLine();

        //Ingredientes
        System.out.print("Ingresa ingredientes: ");
        var strIngredientes = consola.nextLine();

        //Tiempo en minutos
        System.out.print("Ingresa tiempo de preparacion (en minutos): ");
        var intTiempo = Integer.parseInt(consola.nextLine());

        //Dificultad
        System.out.print("Ingresa dificultad: ");
        var strDificultad = consola.nextLine();

        //Imprimir los valores de receta
        System.out.println("\n--- Receta de cocina ---");
        System.out.println("\tNombre receta: " + strReceta);
        System.out.println("\tIngredientes: " + strIngredientes);
        System.out.println("\tTiempo de preparacion: "+ intTiempo + " min");
        System.out.println("\tDificultad: " + strDificultad);

    }
}
