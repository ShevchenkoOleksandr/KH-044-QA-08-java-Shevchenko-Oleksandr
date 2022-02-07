package task_5_arrays;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int userNumber;
        String printString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello \nEnter please number: ");
        userNumber = Math.abs(scanner.nextInt());

        for (int i = 1; i <= userNumber; i++) {
            printString = Task_1.getSymbols(" ", userNumber - i);
            for (int j = i; j >= 1; j--) {
                printString += j + " ";
            }
            System.out.println(printString);
        }
    }
}
