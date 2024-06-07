import java.util.Scanner;

public class StateFromTheNorth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String vet[] = { "roraima", "acre", "amapa", "amazonas", "para", "rondonia", "tocantins" };
        String userInput = keyboard.nextLine();
        boolean found = false;

        for (int i = 0; i < vet.length; i++) {
            if (userInput.equals(vet[i])) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Regiao Norte");
        } else {
            System.out.println("Outra regiao");
        }
        keyboard.close();
    }

}
