import java.util.Scanner;

public class DifferenceBetweenDates {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String date1 = keyboard.nextLine();
        String date2 = keyboard.nextLine();
        int day1 = Integer.parseInt(date1.substring(0, date1.indexOf(" ")));
        int day2 = Integer.parseInt(date2.substring(0, date2.indexOf(" ")));
        int month2 = Integer.parseInt(date2.substring(date2.indexOf(" ") + 1));
        int month1 = Integer.parseInt(date1.substring(date1.indexOf(" ") + 1));

        int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int totalDias = 0;

        for (int i = month1; i < month2; i++) {
            totalDias += diasPorMes[i];
        }

        totalDias = totalDias - day1 + day2;

        System.out.println(totalDias);
        keyboard.close();
    }
}
