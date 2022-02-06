package task_4_arrays;

public class Task_4 {
    public static void main(String[] args) {
        String doubleString, stringToPrint = "";
        double userDouble = 2345.2345;

        doubleString =  String.valueOf(userDouble);

        for (int i = doubleString.length() -1; i >= 0; i-- ){
            stringToPrint += doubleString.charAt(i) + " ";
        }

        System.out.println(doubleString);
        System.out.println(stringToPrint);
    }
}
