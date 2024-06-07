import java.util.Scanner;
import java.lang.Math;

public class PointsDistance {
    public static void main(String[] args) {
        int[] p1 = new int[3];
        int[] p2 = new int[3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a coordenada do ponto 1: ");
            p1[i] = teclado.nextInt();
            System.out.println("Digite a coordenada do ponto 2: ");
            p2[i] = teclado.nextInt();
        }
        int[] resultante = new int[3];
        int count = 0;
        do {
            resultante[count] = p1[count] - p2[count];
            count++;
        } while (count < 3);

        double distancia = Math
                .sqrt((Math.pow(resultante[0], 2)) + (Math.pow(resultante[1], 2)) + (Math.pow(resultante[2], 2)));

        System.out.printf("A distancia entre os dois pontos é: %.2f", distancia);

        teclado.close();
    }
}