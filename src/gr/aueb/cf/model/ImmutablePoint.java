package gr.aueb.cf.model;

/**
 * This {@link ImmutablePoint} provides to clients
 * the ability ti create immutable instances
 */
public class ImmutablePoint {
    //Final fields are immutable
    private final int x;
    private final int y;

    public ImmutablePoint(){
        x = 0;
        y = 0;
    }

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
