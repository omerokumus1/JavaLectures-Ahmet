package AbstractClasses;

public abstract class GeometricObject extends AbstractClasses {
    private String color;
    private boolean filled;

    protected GeometricObject(){
        color = "white";
        filled = false;
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { // concrete method
        return color;
    }

    public void setColor(String color) { // concrete method
        this.color = color;
    }

    public boolean isFilled() { // concrete method
        return filled;
    }

    public void setFilled(boolean filled) { // concrete method
        this.filled = filled;
    }

    // abstract methodlar concrete class'larda implement edilmek zorundadır
    public abstract double getArea();

    public abstract double getPerimeter();



}
