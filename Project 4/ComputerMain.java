public class ComputerMain {
    public static void main(String[] args) {
        Processor laptopProcessor = new Processor("Intel i5", 2.5);
        Processor tabletProcessor = new Processor("Apple A14", 2.8);

        Laptop laptop = new Laptop("Dell", 999.99, true, 2.5, laptopProcessor);
        Tablet tablet = new Tablet("Apple", 599.99, true, true, tabletProcessor);

        laptop.displayInfo();
        tablet.displayInfo();

        laptop.connectToNetwork();
        tablet.touchInput();

        System.out.println(FinalExample.FINAL_VARIABLE);
        FinalExample.staticMethod();

        FinalExample instance1 = new FinalExample();
        FinalExample instance2 = new FinalExample();

        System.out.println("Instance count: " + FinalExample.getInstanceCount());
    }
}