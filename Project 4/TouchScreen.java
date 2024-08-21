public interface TouchScreen {
    void touchInput();
    default void calibrateScreen() {
        System.out.println("Calibrating touch screen.");
    }
}