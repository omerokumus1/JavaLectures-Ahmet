package ExceptionsExamples;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExceptionsExamples {
    public static void main(String[] args) {
        problem12_3();
    }

    // ArrayIndexOutOfBoundsException
    static void problem12_3(){
        /* TODO:
                1. Create an array with 100 randomly chosen integer
                2. Take input from the user to access an element
                3. Apply exception handling
         */
        int[] arr = new int[100];
        initializeArrayWithRandomIntegers(arr);
        while(true){
            try{
                System.out.println("Enter index");
                int index = takeIndex();
                int number = getNumber(arr, index);
                System.out.println("number is " + number);
                break;
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("Enter an integer between 0-99 inclusive.");
            }
        }
    }

    private static int getNumber(int[] arr, int index) throws ArrayIndexOutOfBoundsException{ // atomicity
        try{
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static int takeIndex() {
        Scanner input = new Scanner(System.in);
        while (true){
            try{
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Try integer");
            }
        }
    }

    private static void initializeArrayWithRandomIntegers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    // InputMismatchException
    static void problem12_2() {
        /* TODO:
                1. Take input
                2. Apply try-catch
                3. Read inputs till they become correct
         */

        int n1, n2;
        System.out.println("Enter first number: ");
        n1 = readInput();
        System.out.println("Enter second number: ");
        n2 = readInput();
        System.out.println("sum: " + (n1 + n2));

    }

    private static int readInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Try integer");
            }
        }
    }
}
