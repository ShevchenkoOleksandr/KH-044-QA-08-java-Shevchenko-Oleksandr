package task_2_simple_math;

import java.util.Scanner;

public class Task_2_count_cylinder {

    public static void main(String[] args) {

        int radius, height;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! \nPlease enter cylinder radius:");
        radius = scanner.nextInt();

        System.out.println("Please enter cylinder height:");
        height = scanner.nextInt();

        volume = height * (Math.PI * Math.pow(radius,2));

        System.out.println("The volume of cylinder is - "+volume );
    }
}
