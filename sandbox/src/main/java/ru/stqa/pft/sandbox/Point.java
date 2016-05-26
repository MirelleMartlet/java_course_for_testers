package ru.stqa.pft.sandbox;

/**
 * Created by Irina on 26.05.2016.
 */

public class Point {

    public int x; //координата x
    public int y; //координата y

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double dist(Point p2) {
        double length = Math.sqrt((p2.x - this.x)*(p2.x - this.x) + (p2.y - this.y)*(p2.y - this.y));
        return Math.round(length);
    }

}
