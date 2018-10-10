/**
 * This class can only be initialized using the getInstance method,
 * as the constructor is given private
 */
public class SimpleSingleton {
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
}
