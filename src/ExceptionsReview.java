import java.security.spec.ECField;

public class ExceptionsReview {
    public static void main(String[] args) {
        f3();
        try {
            // 100k$, 100 yıl
            f4();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void f1() { // try-catch: exception'u kendisi çözecek (default çözüm)
        System.out.println("(in f1) division of 4/0 = " + (4 / 0));
    }

    private static void f2() throws ArithmeticException { // throws exception: exception'u kendisi çözmeyecek
        System.out.println("(in f2) division of 4/0 = " + (4 / 0));

    }
    private static void f2_2() throws Exception { // throws exception: exception'u kendisi çözmeyecek
        f2_3();
    }
    private static void f2_3() throws Exception { // throws exception: exception'u kendisi çözmeyecek
        try{
            System.out.println("(in f2_2) division of 4/0 = " + (4 / 0));

        } catch (Exception e){
            throw new Exception();
        }
        System.out.println();
    }



    private static void f3() { // try-catch: exception'u kendisi çözecek (custom çözüm)
        try {
            System.out.println("(in f2) division of 4/0 = " + (4 / 0));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int f4() throws Exception{
        throw new Exception("ERROR: HERO_EQUIPMENT_BUY");
    }

    private static Exception f5(){
        return new Exception("ERROR: HERO_EQUIPMENT_BUY");
    }
}
