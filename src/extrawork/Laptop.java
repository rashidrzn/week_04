package extrawork;

public class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private double  pric;

    public Laptop(String brand, int ram, double pric) {
        super();
        this.brand = brand;
        this.ram = ram;
        this.pric = pric;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPric() {
        return pric;
    }

    public void setPric(double pric) {
        this.pric = pric;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", pric=" + pric +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        if (this.getPric()>o.getPric()){
            return 1;
        } else if (this.getPric()<o.getPric()) {
            return -1;
        }else return 0;
    }
}
