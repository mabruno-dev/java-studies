import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int EvenVet[] = new int[5];
        int OddVet[] = new int[5];
        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i < 15; i++) {
            int N = keyboard.nextInt();
            if (N % 2 == 0) {
                EvenVet[EvenCount] = N;
                EvenCount++;
            } else {
                OddVet[OddCount] = N;
                OddCount++;
            }
            if (EvenCount == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("par[" + j + "] = " + EvenVet[j]);
                }
                EvenCount = 0;
            }
            if (OddCount == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("impar[" + j + "] = " + OddVet[j]);
                }
                OddCount = 0;
            }
        }
        for (int i = 0; i < OddCount; i++) {
            System.out.println("impar[" + i + "] = " + OddVet[i]);
        }
        for (int i = 0; i < EvenCount; i++) {
            System.out.println("par[" + i + "] = " + EvenVet[i]);
        }

        keyboard.close();
    }
}
