package ObjectsAndClasses;


import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        // Instance = obje = object
        // Instantiation = obje oluşturma = object creation

        int x = 5;

        String name = "Omer";

        // instantiation but ugly
        Circle c1 = new Circle();
        c1.radius = 3;
        c1.lineColor = "Red";
        c1.lineWidth = 2;
        c1.xCoordinate = 0;
        c1.yCoordinate = 0;


        System.out.println("Radius: " + c1.radius);
        System.out.println("Line color: " + c1.lineColor);
        System.out.println("Line width: " + c1.lineWidth);
        System.out.println("x coordinate: " + c1.xCoordinate);
        System.out.println("y coordinate: " + c1.yCoordinate);
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Perimeter: " + c1.calculatePerimeter());

        c1.changeLineColor("Blue");
        System.out.println("New color: " + c1.lineColor);

        c1.move(3, 4);
        System.out.println("New center coordinates: (" + c1.xCoordinate + ", " + c1.yCoordinate + ")");

        // instantiation but beautiful
        Circle c2 = new Circle(-3, -5, "Pink", 1, 0);
        System.out.println("Radius: " + c2.radius);
        System.out.println("Line color: " + c2.lineColor);
        System.out.println("Line width: " + c2.lineWidth);
        System.out.println("x coordinate: " + c2.xCoordinate);
        System.out.println("y coordinate: " + c2.yCoordinate);

        c1.radius = -2; // problem!!
        System.out.println("c1 radius: " + c1.radius);

        Circle c3 = new Circle(5, 4);

        // Ch 9.5+
        // what is reference? reference type and reference variable?

        // c3 is called reference variable, the value of c3 is called reference (address), Circle is called reference type
        System.out.println(c3);

        // object vs object reference variable

        /*
         instance method and instance variable (why no static)
         instance method: class içerisinde yazılan static olmayan methodlardır
         instance variable: class içerisinde yazılan static olmayan objeye ait olan property'lerdir
         static yazıyorsa static method veya static variable olur, yazmıyorsa instance method veya instance variable olur

         static methodlar veya değişkenler class'a aittir. Bunları kullanmak için obje üretmeye gerek yoktur.
         instance methodlar  veya değişkenler ise özel bir objeye aittir. Bunları kullanmak için obje üretmek zorunludur.
        */

        int[] arr = {3, 2, 5, 4, 6, 1};
        Sorting sorter = new Sorting();
        System.out.println("Static BubbleSort: " + Arrays.toString(Sorting.bubbleSort(arr)));
        System.out.println("Non-static BubbleSort: " + Arrays.toString(sorter.bubbleSort(arr)));
        System.out.println("c1 Area: " + c1.calculateArea());
        System.out.println("c3 Area: " + c3.calculateArea());
        Math.abs(-2);

        // anonymous object
        System.out.println("Anonymous object area: " + (new Circle(3, 1)).calculateArea());

        System.out.println("A1: " + new Circle(1, 2));
        System.out.println("A2: " + new Circle(1, 2));
        System.out.println("A3: " + new Circle(1, 2));
        System.out.println("A4: " + new Circle(1, 2));
        System.out.println("A5: " + new Circle(1, 2));
//        Circle c4 = createCircleWithNull();
//        System.out.println(c4.radius);

        // garbage collector: kullanılmayan objeleri otomatik olarak toplar

        // Date class
        Date date = new Date();
        System.out.println("Elapsed time: " + date.getTime()); // Date.getTime()
        System.out.println("toString: " + date.toString()); // Date.toString()

        // Random class
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble() * 10 + 5);

        // Point2D
        Point xy = new Point(3, 4);
        Point xy2 = xy.getLocation();
        System.out.println(xy2.getX() + ", " + xy2.getY());

        /* Visibility modifiers
            1. private **
            2. protected
            3. default (herhangi bir şey yazmazsan bu gelir)
            4. public **
         */
        // Data encapsulation
        Square s1 = new Square();
        // getter methodunu kullanma
        s1.getEdge();
        // getter method: private yapılmaz, parametre almaz, basit return yapar, bir yan üründür (?), static olmaz
        Circle c5 = new Circle(3, 2);
        Circle c6 = new Circle(-1, -4); // kısmi encapsulation
        System.out.println("c5: radius = " + c5.radius + ", lineWidth = " + c5.lineWidth);
        System.out.println("c6: radius = " + c6.radius + ", lineWidth = " + c6.lineWidth);
        // problem!! güvenlik açığı var, radius -1 olamazken -1 değer atayabildik.
        c6.radius = -1;
        c6.lineWidth = -4;
        System.out.println("c6: radius = " + c6.radius + ", lineWidth = " + c6.lineWidth);

        // yukarıdaki problemin çözümü: setter methodu: private olabilir (mantığa göre), parametre alır veya almaz,
        // logic implement eder, static olmaz
        Square s2 = new Square(-5);
        Square s3 = new Square(5);
        System.out.println("s2: edge = " + s2.getEdge());
        System.out.println("s3: edge = " + s3.getEdge());

        Circle c7 = new Circle(5, 1);
        Circle c8 = new Circle(5, 2);
        Circle c9 = new Circle(6, 2);
        Circle c10 = new Circle(7, 3);

        // Objelerden array üretme
        Circle[] circles = {c7, c8, c9, c10};

        // Objeleri methoda gönderme ve obje return etme
//        Circle wantedCircle = findCircleByRadius(circles, 10);
//
//        if (wantedCircle != null)
//            System.out.println("wanted circle: radius = " + wantedCircle.radius + ", line color = " + wantedCircle.lineColor
//                            + ", line width = " + wantedCircle.lineWidth); // toString ekle
//        else
//            System.out.println("Not found.");

        Circle[] foundCircles = findCircleByRadius(circles, 5);
        for (int i = 0; i < foundCircles.length; i++) {
            printCircle(foundCircles[i]);
        }

        System.out.println(Math.sqrt(-1));

        // foreach
        Tablet[] tablets = {
                new Tablet("Samsung", "S7", 5000, "AMOLED", "13MP"),
                new Tablet("Samsung", "S7+", 7500, "AMOLED+", "13MP"),
                new Tablet("Samsung", "A7", 1500, "LCD", "13MP"),
                new Tablet("Apple", "Air", 7500, "IPS", "13MP"),
                new Tablet("Apple", "Pro", 15000, "FULL AMOLED", "13MP"),
        };
        for (Tablet item : tablets) {
            item.setPrice(item.getPrice() * 2);
            System.out.println(item);
        }

        // method overloading
        double[] doubleArray = {4.4, 3.3, 6.6, 1.1, 9.9};
        int[] intArray = {4, 3, 6, 1, 9};
        Sorting.bubbleSort(intArray);
        Sorting.bubbleSort(doubleArray);
        System.out.println(Arrays.toString(tablets));


        // Abstraction: sistemler input-output ilişkisi sayesinde hatasız bir şekilde kullanılabilir. Inputun nasıl
        // işlendiğinin bilinmesine gerek yok. Örn; gaza basarsan araba hareket eder, input= gaza basmak, output=arabanın hareket etmesi
        // gelen inputun nasıl işlendiğinin bilinmesine gerek yok.

        // Association: 2 classın birbirleri ile ilişkisi olması durumu
        // Aggregation: Bir classın başka bir class'a property olarak sahip olması. diğer bir adıyla "has-a relationship"
    }


    public static void printCircle(Circle circle) {
        System.out.println("circle: radius = " + circle.radius + ", line color = " + circle.lineColor
                + ", line width = " + circle.lineWidth);
    }

    public static Circle[] findCircleByRadius(Circle[] circles, int radius) {
        int size = 0;
        // find size
        for (int i = 0; i < circles.length; i++) {
            if (circles[i].radius == radius)
                size++;
        }

        // find circles
        Circle[] foundCircles = new Circle[size];
        int index = 0;
        for (int i = 0; i < circles.length; i++) {
            if (circles[i].radius == radius) {
                foundCircles[index] = circles[i];
                index++;
            }
        }


        return foundCircles; // eğer bulamazsan
    }

    public static Circle createCircleWithNull() {
        Circle c = null;
        return c;
    }

}
