package gr.aueb.cf.app;

import gr.aueb.cf.model.Point;
import gr.aueb.cf.model.SingletonPoint;

import static java.lang.Math.abs;

public class PointApp {
    public static void main(String[] args) {

        String outputString;

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point(-10, 10);
        Point p4 =  new Point(5, abs(70));
        Point p5 =  new Point(-1, 0);

        Point p6 = Point.getZeroPoint();
        Point p7 = Point.getRandomPoint();
        Point p8 = Point.getRandomPoint();

        SingletonPoint p9 = SingletonPoint.getSingletonPoint();
        SingletonPoint p10 = SingletonPoint.getSingletonPoint();

        System.out.println(p9.convertToString());
        System.out.println(p10.convertToString());

        p1.setX(2);
        p1.setY(9);

        p2.setX(12);
        p2.setY(1);

        System.out.println(p1.convertToString());
        System.out.println(p2.convertToString());
        System.out.println(p3.convertToString());
        System.out.println(p4.convertToString());
        System.out.println(p5.convertToString());
        System.out.println(p6.convertToString());
        System.out.println(p7.convertToString());
        System.out.println(p8.convertToString());

        outputString = p5.convertToString().concat("Hello World");
        System.out.println(outputString);

    }
}
