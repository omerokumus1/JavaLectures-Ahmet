import java.util.ArrayList;

public class CheckDigits {
    public static void main(String[] args) {
        checkDigits();
    }

    private static void checkDigits() {
        ArrayList<Integer> validNumbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (isNumberValid(i)) {
                validNumbers.add(i);
            }
        }
        printList(validNumbers);
    }

    private static void printList(ArrayList<Integer> validNumbers) {
        System.out.println(validNumbers.size());
    }

    private static boolean isNumberValid(int number) {
        int[] digits = getDigits(number);
        return areDigitsNonincreasing(digits) || areDigitsNondecreasing(digits);
    }

    private static boolean areDigitsNondecreasing(int[] digits) {
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] < digits[i + 1])
                return false;
        }
        return true;
    }

    private static boolean areDigitsNonincreasing(int[] digits) {
        for (int i = 0; i < digits.length - 1; i++) {
            if (digits[i] > digits[i + 1])
                return false;
        }
        return true;
    }

    private static int[] getDigits(int number) {
        String numberString = "" + number;
        int size = numberString.length();
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

}
