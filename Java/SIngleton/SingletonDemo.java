
// Demo class to show all Singleton implementations
public class SingletonDemo {
    public static void main(String[] args) {

        System.out.println("Lazy Singleton: " + LazySingleton.getInstance());
        System.out.println("Thread Safe Singleton: " + ThreadSafeSingleton.getInstance());
        System.out.println("Double Checked Locking Singleton: " + DoubleCheckedLockingSingleton.getInstance());
        System.out.println("Eager Singleton: " + EagerSingleton.getInstance());
        System.out.println("Bill Pugh Singleton: " + BillPughSingleton.getInstance());
        
        EnumSingleton enumInstance = EnumSingleton.INSTANCE;
        enumInstance.showMessage();
        System.out.println("Enum Singleton: " + enumInstance);
    }
}
