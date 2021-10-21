package Polymorphism;

public class Computer {
    private String brand;
    private String cpuBrand;

    public Computer(){

    }

    public Computer(String brand, String cpuBrand) {
        this.brand = brand;
        this.cpuBrand = cpuBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }
}
