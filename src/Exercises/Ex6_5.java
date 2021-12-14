package Exercises;

public class Ex6_5 {
    public static void displaySortedNumbers(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3) {
                System.out.println(num1 + " ");
                if (num2 > num3) {
                    System.out.println(num2);
                    System.out.println(num3);
                }
                else {
                    System.out.println(num3);
                    System.out.println(num2);
                }
            }
            else {
                System.out.println(num3 + " ");
                System.out.println(num1);
                System.out.println(num2);
            }
        }
        else if (num2 > num1){
            if (num2 > num3) {
                System.out.println(num2 + " ");
                if (num1 > num3) {
                    System.out.println(num1);
                    System.out.println(num3);
                }
                else{
                    System.out.println(num3);
                    System.out.println(num1);
                }
            }

            else {
                System.out.println(num3 + " ");
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }

    public static void main(String[] args) {
        displaySortedNumbers(1,2,3);
        displaySortedNumbers(3,2,1);
        displaySortedNumbers(2,5,1);
        displaySortedNumbers(5,1,2);
    }
}
