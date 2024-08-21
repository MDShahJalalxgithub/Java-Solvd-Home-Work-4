public interface NetworkEnabled {
    void connectToNetwork();
    default void networkStatus() {
        System.out.println("Network is connected.");
    }
}