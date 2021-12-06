package Exercises;

import java.util.Scanner;


public class Ex5_19 {
    public static void main(String[] args) {
        int maxRow = 8;
        int number = 1;
        for (int row = 0; row < maxRow; row++) {
            number = 1;
            for (int i = maxRow - row; i > 0; i--) {
                System.out.print("\t");
            }
            for (int i = 0; i <= row; i++) {
                System.out.printf("%4d", number);
                number *= 2;
            }
            number /= 2;
            for (int i = 0; i <= row - 1; i++) {
                number /= 2;
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}
