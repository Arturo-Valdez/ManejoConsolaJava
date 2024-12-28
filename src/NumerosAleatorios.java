import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios");
        var random = new Random();

        //Generar un numero aleatorio entre 0 y 9
        var intNumerosAleatorios = random.nextInt(10);
        System.out.println("Numeros Aleatorios entre 0 y 9 = " + intNumerosAleatorios);

        //Generar un numero aleatorio entre 1 y 10
        intNumerosAleatorios = random.nextInt(10)+1;
        System.out.println("Numeros Aleatorios entre 1 y 10 = " + intNumerosAleatorios);

        //Generar un numero flotante entre 0.0 a 1.0
        var floatAleatorio = random.nextFloat();
        System.out.println("Aleatorios decimal = " + floatAleatorio);

        //Simular el lanzamiento de un dado (1 y 6)
        var intDadoAleatorio = random.nextInt(6) + 1;
        System.out.println("Dado Aleatorio = " + intDadoAleatorio);
    
    }
}
