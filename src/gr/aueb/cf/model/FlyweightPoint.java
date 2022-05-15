package gr.aueb.cf.model;

import java.util.Random;

/**
 * The Flyweight class is an instance-controlled class, that allows
 * only two instances of specific points to be created.
 * A Zero-point instance and random-point instance (thus the value of
 * the random instance is always the same). It is also implements the
 * Flyweight pattern since two zero points p1, p2 are equal if and
 * only if p1 == p2.
 */
public class FlyweightPoint {
    private int x;
    private int y;

    private static final FlyweightPoint ZERO = new FlyweightPoint();
    private static final FlyweightPoint RDM = new FlyweightPoint(System.currentTimeMillis());

    private FlyweightPoint(){}
    private FlyweightPoint(long seed){
        Random r = new Random(seed);
        this.x = r.nextInt();
        this.y = r.nextInt();
    }

    public static FlyweightPoint getZeroPoint(){
        return ZERO;
    }

    public static FlyweightPoint getRandomPoint(){
        return RDM;
    }

    public String pointToString(){
        return "(" + x + "," + y + ")";
    }
}
