public class MainSingleton {
    public static void main(String[] args) {
        SingletonLogger logger1 = SingletonLogger.getInstance();
        SingletonLogger logger2 = SingletonLogger.getInstance();
        logger1.log("Hello from Singleton");
        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
    }
}