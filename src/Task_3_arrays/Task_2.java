package Task_3_arrays;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inStr;

        System.out.println("Hello, \nPlease enter any symbols:");
        inStr = scan.nextLine();

        System.out.println(inStr);

        if (inStr.matches("[A-Z]+")) {
            System.out.println("This string contain uppercase symbols");
        }
    }
}
