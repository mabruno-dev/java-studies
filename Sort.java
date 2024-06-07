import java.lang.Math;

public class Sort {
    public static void main(String[] args) {
        int[] vet = new int[100];
        int aux = 0;

        for (int i = 0; i < 100; i++) {
            vet[i] = (int) (Math.random() * 200);
        }

        System.out.println("Vetor desordenado:");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet[i] + ", ");
        }

        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                if (vet[j] < vet[i]) {
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Vetor organizado: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(vet[i] + ", ");
        }
    }
}
