package task_2_simple_math;

public class Task_4_decrement_increment {
    public static void main(String[] args) {
        int intVar = 5;

        for(int i=0; i<5; i++){
            intVar += i;
            System.out.println(intVar+" "+i);
        }
        System.out.println(intVar+"\n\n");

        intVar = 20;
        for(int i=0; i<5; i++){
            intVar -= i;
            System.out.println(intVar+" "+i);
        }
        System.out.println(intVar+"\n\n");

        intVar = 2;
        for(int i=1; i<=5; i++){
            intVar *= i;
            System.out.println(intVar+" "+i);
        }
        System.out.println(intVar+"\n\n");
    }
}
