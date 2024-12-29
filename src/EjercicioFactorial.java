import java.util.Scanner;

public class EjercicioFactorial {
    public static void main(String[] args) {

        var factor = Factorial(5);
        System.out.println(factor);

    }

    private static int Factorial(int numero){
        if(numero == 1 || numero == 0){
            return 1;
        }
        else {
            return numero * Factorial(numero-1);

        }
    }
}
