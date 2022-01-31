package Task_3_arrays;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] nmbrs = new int[4];
        String[] stepsName = {"first", "second", "third", "fourth"};

        System.out.println("Hello \nPlease enter 4 any numbers");
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter " + stepsName[i] + " number:");
            nmbrs[i] = scn.nextInt();
        }

        for ( int nmbr: nmbrs){
            if(nmbr % 3 == 0 || nmbr % 5 == 0){
                System.out.println(nmbr + " - is able divided by '3' or '5' ");
            }
        }
    }
}
