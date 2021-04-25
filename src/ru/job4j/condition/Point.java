package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.pow((x2 - x1),2);
        double rsl2 = Math.pow((y2 - x1),2);
        double rsl3 = Math.sqrt(rsl1 + rsl2);
        return rsl3;
    }

    public static void main(String[] args) {
        double result = Point.distance(5,7,-3,2);
        System.out.println("result from (x1, y1) to (x2, y2) " + result);
    }
}
