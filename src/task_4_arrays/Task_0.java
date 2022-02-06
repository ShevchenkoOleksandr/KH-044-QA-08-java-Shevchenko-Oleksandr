package task_4_arrays;

public class Task_0 {

    public static void main(String[] args) {
        int[] LevelArrayLength = {4, 7}; // {vertical, horizontal}
        char displayingChar = '+';
        char[][] charArray = new char[LevelArrayLength[0]][LevelArrayLength[1]];

        for (int i = 0; i < LevelArrayLength[0]; i++) {
            for (int ii = 0; ii < LevelArrayLength[1]; ii++) {
                charArray[i][ii] = displayingChar;
            }
        }

        for (char[] tmpArr : charArray) {
            for (char tmpChar : tmpArr) {
                System.out.print(tmpChar);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
