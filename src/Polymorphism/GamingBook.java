package Polymorphism;

public class GamingBook extends Laptop{
    private String gpuBrand;

    public GamingBook(String resolution, String gpuBrand) {
        super(resolution);
        this.gpuBrand = gpuBrand;
    }

    public GamingBook(String brand, String cpuBrand, String resolution, String gpuBrand) {
        super(brand, cpuBrand, resolution);
        this.gpuBrand = gpuBrand;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }
}
