import java.util.Scanner;

public class Teste {
    public static int soma(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b = 0;
        a = teclado.nextInt();
        b = teclado.nextInt();
        int sum = 0;
        sum = soma(a, b);
        System.out.println("A soma de a e b e: " + sum);

        int count = 0;
        do {
            System.out.println("oi");
            count++;
        } while (count != 3);

        for (int i = 0; i < 10; i++) {
            System.out.println("OI");
        }

        while (count < 10) {
            System.out.println("Oi");
            count++;
        }

        teclado.close();
    }
}