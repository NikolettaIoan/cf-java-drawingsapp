package gr.aueb.cf.model;

/**
 * The {@link SingletonPoint} is an instance-controlled class.
 * IIt constructs only one instance fo the class.
 * *** The Singleton Design Pattern***
 */
public class SingletonPoint {
    private int x;
    private int y;

    // Creates a pre-constructed instance (eager instantiation)
    private static final SingletonPoint SINGLETON_POINT = new SingletonPoint();

    private SingletonPoint(){}

    public static SingletonPoint getSingletonPoint(){
        return SINGLETON_POINT;
    }

    public String convertToString(){
        return "(" + x + " , " + y + ")";
    }
}
