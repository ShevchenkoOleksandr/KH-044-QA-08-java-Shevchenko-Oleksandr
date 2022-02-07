package task_5_arrays;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int figureSize;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello \nEnter please Rhombus Size: ");
        figureSize = Math.abs( scanner.nextInt() );
        if(figureSize % 2 == 0) figureSize++;

        printRhombus(figureSize);
    }

    private static void printRhombus( int rhombusSize){
        int  leftHashCount, spaceCount = 1, loopCount;
        String rowString = "";
        loopCount = rhombusSize - 2;
        System.out.println(getSymbols("# ", rhombusSize));
        for (int i = 0, ii = loopCount; i < loopCount; i++, ii--) {
            leftHashCount = (rhombusSize - spaceCount) / 2;
            rowString = getSymbols("# ", leftHashCount)
                    + getSymbols("  ", spaceCount)
                    + getSymbols("# ", leftHashCount);
            if (i < ii && leftHashCount > 1) spaceCount += 2;
            else spaceCount -= 2;
            System.out.println(rowString);
        }
        System.out.println(getSymbols("# ", rhombusSize));
    }

    private static String getSymbols(String symbol, int count) {
        String symbolString = "";
        for (int i = 0; i < count; i++) symbolString += symbol;
        return symbolString;
    }
}
