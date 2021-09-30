package ObjectsAndClasses;

public class Tablet {
    private String brand;
    private String model;
    private int price;
    private String displayQuality;
    private String cameraQuality;

    Tablet(String brand, String model, int price, String displayQuality, String cameraQuality){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.displayQuality = displayQuality;
        this.cameraQuality = cameraQuality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", displayQuality='" + displayQuality + '\'' +
                ", cameraQuality='" + cameraQuality + '\'' +
                '}';
    }
}
