package gr.aueb.cf.app;

import gr.aueb.cf.model.Point;
import static java.lang.Math.abs;

public class PointApp {
    public static void main(String[] args) {

        String outputString;

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point(-10, 10);
        Point p4 =  new Point(5, abs(70));
        Point p5 =  new Point(-1, 0);

        p1.setX(2);
        p1.setY(9);

        p2.setX(12);
        p2.setY(1);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
        System.out.println(p4.convertToString());

        outputString = p5.convertToString().concat("Hello World");
        System.out.println(outputString);

    }
}
