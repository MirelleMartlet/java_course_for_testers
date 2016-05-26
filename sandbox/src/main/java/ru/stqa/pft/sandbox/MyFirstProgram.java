package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static double distance(Point p1, Point p2) {
        return Math.round(Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y)));
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 8);
        Point p2 = new Point(1, 12);

        System.out.println(distance(p1, p2)); //функция
        System.out.println(p1.dist(p2)); //метод
    }




}
