public final class FinalExample {
    public static final String FINAL_VARIABLE = "This is a final variable.";
    private static int instanceCount;

    static {
        instanceCount = 0;
        System.out.println("Static block executed.");
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public FinalExample() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}