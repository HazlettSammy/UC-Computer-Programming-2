package MyPoint;

import java.lang.Math;

class MyPoint {
    /* fields x and y that represent the coordinates with getter methods */
    private double x;
    private double y;

    /* The getter methods */
    public double getX() { return x; }
    public double getY() { return y; }

    /* Implementing the constructors with the getters */
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* Implementing the distance methods for x and y */
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static double distance(MyPoint pt1, MyPoint pt2) {
        return Math.sqrt(Math.pow(pt1.x - pt2.x, 2) + Math.pow(pt1.y - pt2.y, 2));
    }


    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        /* Check both versions of distance */
        System.out.println("The distance calculated by the first instance method: ");
        System.out.println(p1.distance(p2));
        System.out.println("*****************");
        System.out.println("The distance calculated by the second instance method: ");
        System.out.println(p1.distance(10, 30.5));
        System.out.println("*****************");
        System.out.println("The distance calculated by the static method: ");
        System.out.println(MyPoint.distance(p1, p2));
    }
}