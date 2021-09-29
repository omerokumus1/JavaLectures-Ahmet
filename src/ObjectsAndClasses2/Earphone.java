package ObjectsAndClasses2;

public class Earphone {
    private String brand;
    private String model;
    private String type; // can be turned into an object
    private String color;
    private int volumeLevel;
    private boolean isWireless;

    Earphone(String brand, String model, String type, String color, int volumeLevel, boolean isWireless){
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.volumeLevel = volumeLevel;
        this.isWireless = isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isWireless() {
        return isWireless;
    }
}
