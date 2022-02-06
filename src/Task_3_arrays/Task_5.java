package Task_3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String colorName;
        int wordLength;

        while (true) {
            System.out.println("Enter color name or 'exit' to quit:");
            colorName = scan.nextLine();

            if (colorName.equals("exit")) {
                break;
            }

            switch (colorName) {
                case "red":
                    wordLength = 3;
                    break;
                case "pink":
                case "blue":
                    wordLength = 4;
                    break;
                case "white":
                case "black":
                case "green":
                    wordLength = 5;
                    break;
                case "yellow":
                case "orange":
                    wordLength = 6;
                    break;
                default:
                    wordLength = 0;
                    break;
            }

            System.out.println("Length of this word is " + wordLength + " symbols");
        }
    }
}
