public class Laptop extends Computer implements Portable {
    protected double weight;

    public Laptop(String brand, double price, boolean isPortable, double weight, Processor processor) {
        super(brand, price, isPortable, processor);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop: " + getBrand() + ", Price: $" + getPrice() +
                ", Weight: " + weight + " kg, Processor: " + processor.getModel() + ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the laptop.");
    }
}