import java.util.Scanner;
import java.lang.Math;

public class Raizes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("Digte o valor de a: ");
        a = teclado.nextFloat();
        System.out.print("Digite o valor de b:");
        b = teclado.nextFloat();
        System.out.print("Digite o valor de c:");
        c = teclado.nextFloat();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("não existem raizes reais");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Existe uma raiz real para a equação: x1= " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta) / 2 * a);
            x2 = (-b - Math.sqrt(delta) / 2 * a);
            System.out.println("Existem duas raizes reais para a equação: x1= " + x1 + " e x2= " + x2);
        }
        teclado.close();
    }
}