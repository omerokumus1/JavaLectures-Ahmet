package ObjectsAndClasses;


import java.awt.*;
import java.awt.geom.Point2D;
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

        c1.move(3,4);
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
        System.out.println("Static BubbleSort: "+Arrays.toString(Sorting.bubbleSort(arr)));
        System.out.println("Non-static BubbleSort: "+Arrays.toString(sorter.bubbleSort(arr)));
        System.out.println("c1 Area: " + c1.calculateArea());
        System.out.println("c3 Area: " + c3.calculateArea());
        Math.abs(-2);

        // anonymous object
        System.out.println("Anonymous object area: " + (new Circle(3, 1)).calculateArea() );

        System.out.println("A1: " + new Circle(1,2));
        System.out.println("A2: " + new Circle(1,2));
        System.out.println("A3: " + new Circle(1,2));
        System.out.println("A4: " + new Circle(1,2));
        System.out.println("A5: " + new Circle(1,2));
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
        System.out.println(random.nextDouble()*10 + 5);

        // Point2D
        Point xy = new Point(3,4);
        Point xy2 = xy.getLocation();
        System.out.println(xy2.getX() + ", " + xy2.getY());
    }

    public static Circle createCircleWithNull(){
        Circle c = null;
        return c;
    }

}
