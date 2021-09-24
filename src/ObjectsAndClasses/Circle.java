package ObjectsAndClasses;

public class Circle {
    // statik özellikler = property = attribute = instance variables (static değilse)
    static double pi = 3.14;
    int radius = 1;
    int lineWidth;
    String lineColor = "Black";
    int xCoordinate;
    int yCoordinate;
    // data field: property'lerin bulunduğu kısım
    // state of the object (objenin durumu): property'lerin anlık değerleri

    // Constructor: Özel bir methoddur, objenin kendisini oluşturur.
    Circle() { // default constructor

    }

    Circle(int radius, int lineWidth, String lineColor, int xCoordinate, int yCoordinate) {
        // ugly
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
        if (lineWidth > 0)
            this.lineWidth = lineWidth;
        else
            this.lineWidth = 1;
        this.lineColor = lineColor;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    Circle(int radius, int lineWidth){
        // beautiful
        checkAndAssignRadius(radius);
        checkAndAssignLineWidth(lineWidth);
        // default values
        lineColor = "Black";
        xCoordinate = 0;
        yCoordinate = 0;

    }

    // private olabilir (Sonra anlatılacak)
    public void checkAndAssignRadius(int radius){
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

    public void checkAndAssignLineWidth(int lineWidth){
        if (lineWidth > 0)
            this.lineWidth = lineWidth;
        else
            this.lineWidth = 1;
    }

    public void shiftAlongX(int shiftingValue) {
        xCoordinate += shiftingValue;
    }

    public void shiftAlongY(int shiftingValue) {
        yCoordinate += shiftingValue;
    }

    public void move(int xShiftingValue, int yShiftingValue) {
        shiftAlongX(xShiftingValue);
        shiftAlongY(yShiftingValue);
    }

    public double calculateArea() {
        System.out.println("pi = " + pi);
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void changeLineColor(String newLineColor) {
        lineColor = newLineColor;
    }
}
