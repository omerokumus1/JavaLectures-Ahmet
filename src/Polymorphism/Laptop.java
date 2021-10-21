package Polymorphism;

public class Laptop  extends Computer {
    private String resolution;

    public Laptop(String resolution) {
        this.resolution = resolution;
    }

    public Laptop(String brand, String cpuBrand, String resolution) {
        super(brand, cpuBrand);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
