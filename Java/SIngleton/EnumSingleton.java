
// Enum Singleton (thread-safe and protects against reflection/serialization)
public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Enum Singleton");
    }
}
