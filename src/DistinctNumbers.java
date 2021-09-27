import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {
    /*
        1. Take input as string
        2. Parse input and create an array
            2.1 Find array size
            2.2 Obtain numbers from input string into the array
        3. Obtain distinct numbers
        4. Print distinct number
     */
    public static void main(String[] args) {
        parseStringIntoArray();
    }

    public static String readInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void parseStringIntoArray() {
        String str = readInput();
        int arrSize = findSize(str);
        int[] numberExtracted = initializeArray(arrSize, str);
        printResult(numberExtracted);
    }

    private static void printResult(int[] numberExtracted) {
        System.out.println(Arrays.toString(numberExtracted));
    }

    private static int findSize(String str) {
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isAProperDigit(str, i))
                numberCount++;
        }
        return numberCount;
    }

    private static boolean isAProperDigit(String str, int i) {
        return isDigit(str, i) && !isCounted(str, i);
    }

    private static boolean isDigit(String str, int i) {
        return Character.isDigit(str.charAt(i));
    }

    private static boolean isCounted(String str, int i) {
        for (int j = 0; j < i; j++) {
            if (str.charAt(j) == str.charAt(i))
                return true;
        }
        return false;
    }


    public static int[] initializeArray(int size, String str) {
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isAProperDigit(str, i)) {
                arr[index] = Integer.parseInt(str.charAt(i) + "");
                index++;
            }
        }
        return arr;
    }

}
