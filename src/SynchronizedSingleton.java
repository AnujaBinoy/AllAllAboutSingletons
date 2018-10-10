/**
 * Simple singleton, no matter early or lazy initialization, is not thread safe.
 * Synchronized keyword makes one thread to wait till the other one is done working
 * with the singleton class
 */

public class SynchronizedSingleton {

    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton(){
        System.out.println("Creation happens only once");
    }
    //The only difference is the synchronized keyword
    static synchronized SynchronizedSingleton getInstance(){
        if(synchronizedSingleton == null){
            synchronizedSingleton = new SynchronizedSingleton();
            return synchronizedSingleton;
        }
        return synchronizedSingleton;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        });
        Thread thread2 = new Thread(() -> {
            SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        });
        thread1.start();
        thread2.start();
    }
}
