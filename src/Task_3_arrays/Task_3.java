package Task_3_arrays;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        String strYear;

        while (true) {
            System.out.println("Enter Year or enter 'exit' to quit:");
            strYear = scan.nextLine();
            if (strYear.equals("exit")) {
                break;
            }
            year = Integer.parseInt(strYear);
            if (java.time.Year.of(year).isLeap()) {
                System.out.println(year + " is leap year ");
            } else {
                System.out.println(year + " isn't leap year ");
            }
        }
    }
}
