package task_4_arrays;

public class Task_3 {
    public static void main(String[] args) {

        int userSize = 8;
        String stringToPrint;

        for (int i = 1; i <= userSize; i++) {
            stringToPrint = getHashString(i);
            System.out.println(stringToPrint);
        }

        System.out.println("-------");

        for (int i = userSize; i > 0; i--) {
            stringToPrint = getHashString(i);
            System.out.println(stringToPrint);
        }

        System.out.println("-------");

        for (int i = 1; i <= userSize; i++) {
            stringToPrint = getSpaceAndHashString(i, userSize);
            System.out.println(stringToPrint);
        }

        System.out.println("-------");

        for (int i = userSize; i > 0; i--) {
            stringToPrint = getSpaceAndHashString(i, userSize);
            System.out.println(stringToPrint);
        }
    }

    private static String getHashString(int size) {
        String hashString = "";
        for (int i = 0; i < size; i++) {
            hashString += "# ";
        }
        return hashString;
    }

    private static String getSpaceAndHashString(int hashSize, int fullSize){
        String hashString = "";
        int spaceSize = fullSize - hashSize;
        for (int i = 0; i < spaceSize; i++) {
            hashString += "  ";
        }
        hashString += getHashString(hashSize);
        return hashString;
    }
}


