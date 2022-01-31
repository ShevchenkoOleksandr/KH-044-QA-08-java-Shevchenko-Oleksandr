package Task_3_arrays;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int monthNmbr;
        String monthStr, periodOfYear, periodStr;


        while (true) {
            System.out.println("Enter number of month or 'exit' to quit:");
            monthStr = scan.nextLine();

            if (monthStr.equals("exit")) {
                break;
            }
            monthNmbr = Integer.parseInt(monthStr);

            System.out.println(monthNmbr);

            if(monthNmbr == 12 || monthNmbr <= 2 ){
                periodStr = "Winter";
            }else if(monthNmbr >= 3 && monthNmbr <= 5){
                periodStr = "Spring";
            }else if(monthNmbr >= 6 && monthNmbr <= 8){
                periodStr = "Summer";
            }else if(monthNmbr >= 9 && monthNmbr <= 11){
                periodStr = "Autumn";
            }else{
                periodStr = "--! Wrong number of month--";
            }

            System.out.println("This is " + periodStr);
        }

    }

//    public static String periodOfYear(int monthNmbr){
//        String periodStr = null;
//
//        if(monthNmbr == 12 || monthNmbr <= 2 ){
//            periodStr = "Winter";
//        }else if(monthNmbr >= 3 || monthNmbr <= 5){
//            periodStr = "Spring";
//        }else if(monthNmbr >= 6 || monthNmbr <= 8){
//            periodStr = "Summer";
//        }else if(monthNmbr >= 9 || monthNmbr <= 11){
//            periodStr = "Autumn";
//        }else{
//            periodStr = "--! Wrong number of month--";
//        }
//
//        return periodStr;
//    }
}
