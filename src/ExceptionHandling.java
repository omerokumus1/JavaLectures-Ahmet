import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
//        while (true) {
//            try {
                // openTxtFile(filename);
//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter inputs");
//                a = readInput();
//                b = input.nextInt();
//                System.out.println("After b.");
////                System.out.println("Result: " + (a / b));
////                divide(a, b);
////                divide2(a,b);
//                divide3(a,b);
//                System.out.println("After division");
//                break;
//            } catch (Exception e) {
        //        catchFileOpeningException(e);
//                System.out.println("Catch");
//                System.out.println(e.getMessage());
//
//            }
//
//        }
//        try {
//            System.out.println("Enter inputs");
//            a = readInput2();
//            b = readInput2();
//            System.out.println("After b.");
//            divide2(a, b);
//            System.out.println("After divide2");
//            divide3(a, b);
//        } catch (InputMismatchException e) {
//            System.out.println("InputMismatchException");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//        } catch (Exception e){
//            System.out.println("Exception");
//
//        } finally {
//            System.out.println("Teşekkürler");
//        }
        try {
            f1();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        f1();
        try {
            f4();
        } catch (MyException e) {
            System.out.println(e.getMyMessage());
        }
        System.out.println("end");
    }

    public static void f4() throws MyException{
        throw new MyException();
    }

    public static int readInput() {
        Scanner input = new Scanner(System.in);
        int a;
        while (true) {
            try {
                a = input.nextInt();
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Try integer values");
            }
        }
        return a;
    }

    public static int readInput2() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }


    public static void divide(int a, int b) {
        System.out.println("(divide) Result: " + (a / b));
    }

    public void dummyF() throws Exception {
        System.out.println("dummy function");
    }

    public static void divide2(int a, int b) throws ArithmeticException { // try catch içerisinde kullanılmak zorunda
        if (b == 0)
            throw new ArithmeticException("divide2, ArithmeticException");
        else
            System.out.println("(divide2) Result: " + (a / b));
    }

    public static void divide3(int a, int b) throws Exception, ArithmeticException { // try catch içerisinde kullanılmak zorunda

        if (b == 0) {
            String message = "in divide3 method, the denominator is found to be 0. So, division error occured.";
            throw new Exception(message);
        } else
            System.out.println("(divide3) Result: " + (a / b));
    }

    public static void f1() throws Exception{
        try{
            f2();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        f2();
    }
    public static void f2() throws Exception{
        try{
            f3();
        } catch (Exception e){
            throw e;
        }
    }
    public static void f3() throws Exception{
        throw new Exception("rethrowing exceptions");
    }


}
