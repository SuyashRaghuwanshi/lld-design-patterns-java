package Java.Singleton;
public class Singleton{
    
    //Lazy Initialization Singleton pattern

    //It is not thread safe
    public static class LazySingleton {
        private LazySingleton(){
        }
        private static LazySingleton instance;
        public static LazySingleton getInstance(){
            if(instance==null){
                instance= new LazySingleton();
            }
            return instance;
        }
        
    }

    //Thread safe using synchroinzation keyword
    //Thread safe but still has performance issues
    public static class ThreadSafeSingleton {
        private static ThreadSafeSingleton instance;
        private ThreadSafeSingleton(){}
        public static synchronized ThreadSafeSingleton getInstance(){
            if(instance==null){
                return new ThreadSafeSingleton();
            }
            return instance;
        }
    }

    //Double Checked Locking
    public static class DoubleCheckedLockingSingleton{
        private static DoubleCheckedLockingSingleton instance;
        private DoubleCheckedLockingSingleton(){}
        public static DoubleCheckedLockingSingleton getInstance(){
            if(instance==null){
                synchronized (DoubleCheckedLockingSingleton.class) {
                    if(instance==null){
                        instance= new DoubleCheckedLockingSingleton();
                    }
                }
            }
            return instance;
        }
    }
    //Eager Initialization Singleton Pattern
    public static class EagerSingleton {
        private static final EagerSingleton instance = new EagerSingleton();
        private EagerSingleton(){
    
        }
        public static EagerSingleton getInstance(){
            return instance;
        }
    }
    //Bill Pugh Singleton Implementation
    public static class BillPughSingleton {
        
        private BillPughSingleton(){}
        public static class SingletonHelper{
            private static final BillPughSingleton instance =new BillPughSingleton();
        }
        public static BillPughSingleton getInstance(){
            return SingletonHelper.instance;
        }
    }

    //enum Singleton
    //In java ENUMs are created only once by JVM at the time of class loading
    //ThreadSafe and also prevents against serialization and reflection attacks
    public enum EnumSingleton {
        INSTANCE;
        public static EnumSingleton getInstance(){
            return INSTANCE;
        }
    }
}
