import java.util.Scanner;

public class Funcao {
    public static int lerTeclado(Scanner teclado) {
        int oi = teclado.nextInt();
        return oi;
    }

    public static int troca(int a, int b) {
        int temp;
        temp = b;
        b = a;
        a = temp;
        return b;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b = 0;
        a = lerTeclado(teclado);
        b = lerTeclado(teclado);
        System.out.printf("%d, %d", a, b);
        a = troca(a, b);
        b = troca(b, a);
        System.out.printf("%d, %d", a, b);
        teclado.close();
    }

}
