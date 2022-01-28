package task_1_scanner;

import java.util.Scanner;

public class Where_live {

    public static void main(String[] args) {
        String name, address;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        name = scanner.nextLine();

        System.out.println("Where are you live "+name+" ?");

        address = scanner.nextLine();

        System.out.println("Your name is "+name);
        System.out.println("You live here "+address);
    }
}
