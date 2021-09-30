package ObjectsAndClasses2;

public class Pencil {
    private String brand;
    private String color;

    Pencil(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
    public boolean equals(Pencil pencil){
        boolean areBrandsEqual = brand == pencil.brand;
        boolean areColorsEqual = color == pencil.color;

        return areBrandsEqual && areColorsEqual;
    }

    public String toString(){
        String content = "";

        content += "Brand: " + brand +
                "\nColor: " + color;

        return content;
    }
}
