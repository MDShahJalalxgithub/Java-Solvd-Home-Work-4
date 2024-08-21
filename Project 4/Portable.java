public interface Portable {
    void carry();
    default void portableStatus() {
        System.out.println("This device is portable.");
    }
}