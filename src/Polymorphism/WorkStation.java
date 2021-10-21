package Polymorphism;

public class WorkStation extends Laptop{
    private String ram;

    public WorkStation(String resolution, String ram) {
        super(resolution);
        this.ram = ram;
    }

    public WorkStation(String brand, String cpuBrand, String resolution, String ram) {
        super(brand, cpuBrand, resolution);
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
