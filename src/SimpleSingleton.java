/**
 * This class can only be initialized using the getInstance method,
 * as the constructor is given private
 */
public class SimpleSingleton {
    /**
     * private static SimpleSingleton simpleSingleton = new SimpleSingleton();
     *
     * The above line also works instead of the line we have here. It is called eager initialization.
     * To put it simply, the object is created before even getInstance() is invoked.
     * What we have here is called lazy initialization
     */
    private static SimpleSingleton simpleSingleton;
    private SimpleSingleton(){
        System.out.println("Creation happens only once");
    }
    //If statement makes sure that an object is NOT created every time
    // the function is called
    public static SimpleSingleton getInstance(){
        if(simpleSingleton == null){
            simpleSingleton = new SimpleSingleton();
            return simpleSingleton;
        }
        return simpleSingleton;
    }

    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
    }
}
