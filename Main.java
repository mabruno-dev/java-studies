import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        int factorial = N;
        for (int i = N - 1; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

        keyboard.close();
    }

}