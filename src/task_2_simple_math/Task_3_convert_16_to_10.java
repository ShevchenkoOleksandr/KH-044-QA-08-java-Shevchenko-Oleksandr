package task_2_simple_math;

import java.util.Scanner;

public class Task_3_convert_16_to_10 {

    public static void main(String[] args) {
        String hex;
        long result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter HEX code:");
        hex = scanner.nextLine();

        result = Long.parseLong(hex, 16);

        System.out.println(result);
    }

}
