package task_4_arrays;

public class Task_2 {
    public static void main(String[] args) {
        int abcResult = 0, A = 0, B = 0, C = 1;

        for (int i = 0; i < 20; i++) {
            if(abcResult == 0) {
                System.out.print(A +", "+ B +", "+ C +", ");
            }
            else{
                A = B;
                B = C;
                C = abcResult;

                System.out.print(abcResult + ", ");
            }
            abcResult = A+B+C;
        }
        System.out.print("...");
    }
}
