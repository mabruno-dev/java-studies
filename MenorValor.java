import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class MenorValor {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int posicao = 0, menor = 0;

        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = teclado.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                posicao = i;
                menor = X[i];
            } else {
                if (X[i] < menor) {
                    menor = X[i];
                    posicao = i;
                }
            }
        }
        System.out.println("Menor Valor: " + menor);
        System.out.println("Posicao: " + posicao);

        teclado.close();

    }

}