public class Tablet extends Computer implements Portable, TouchScreen {
    protected boolean hasStylus;

    public Tablet(String brand, double price, boolean isPortable, boolean hasStylus, Processor processor) {
        super(brand, price, isPortable, processor);
        this.hasStylus = hasStylus;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tablet: " + getBrand() + ", Price: $" + getPrice() +
                ", Has Stylus: " + hasStylus + ", Processor: " + processor.getModel() + ", Speed: " + processor.getSpeed() + " GHz");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the tablet.");
    }

    @Override
    public void touchInput() {
        System.out.println("Using touch input.");
    }
}