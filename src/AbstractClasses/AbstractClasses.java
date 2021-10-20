package AbstractClasses;

public class AbstractClasses {
    // Abstraction:
    // abstract and concrete
    public static void main(String[] args) {
        System.out.println();
        // abstract methodlar concrete class'larda implement edilmek zorundadır
        // abstract class başka bir abstract class'ı extend edebilir.

        ACircle c1 = new ACircle("while", false, 3);
        ACircle c2 = new ACircle("black", false, 5);
        System.out.printf("c1 area: %.2f\n", c1.getArea());
        System.out.printf("c1 perimeter: %.2f\n", c1.getPerimeter());
        System.out.printf("c2 area: %.2f\n", c2.getArea());
        System.out.printf("c2 perimeter: %.2f\n", c2.getPerimeter());

        // abstract class'tan obje üretilemez çünkü abstract methodlar tanımlı değildir.
        // abstract method olmayan bir abstract class'tan da obje üretilemez.
        GeometricObject go = new GeometricObject(){
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        // abstract class'tan obje üretilemez fakat abstract class veri tipi olarak kullanılabilir.
        GeometricObject[] goArray = {
                new ACircle("white", false, 1),
                new ACircle("white", false, 2),
                new ACircle("white", false, 3),
                new ACircle("white", false, 4),
                new ARectangle("black", false, 1, 2),
                new ARectangle("black", false, 1, 3),
                new ARectangle("black", false, 1, 4),
        };


    }
}
