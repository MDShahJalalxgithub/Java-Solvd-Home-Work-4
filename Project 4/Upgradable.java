public interface Upgradable {
    void upgradeHardware();
    default void checkCompatibility() {
        System.out.println("Checking hardware compatibility...");
    }
}