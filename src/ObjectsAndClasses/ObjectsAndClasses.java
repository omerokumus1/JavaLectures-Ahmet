package ObjectsAndClasses;

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
        // object vs object reference variable
        // instance method and instance variable (why no static)
        // anonymous object
    }
}
