package AbstractClasses;

public class ARectangle extends GeometricObject {
    private double shortEdge;
    private double longEdge;

    public ARectangle(String color, boolean filled, double shortEdge, double longEdge) {
        super(color, filled);
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    @Override
    public double getArea() {
        return longEdge * shortEdge;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longEdge + shortEdge);
    }
}
