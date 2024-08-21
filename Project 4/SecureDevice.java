public interface SecureDevice {
    void encryptData();
    default void securityCheck() {
        System.out.println("Performing security check.");
    }
}