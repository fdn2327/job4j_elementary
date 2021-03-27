package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1; double rsl2 = y2 - x1; double rsl3 = Math.pow(rsl1,2); double rsl4 = Math.pow(rsl2,2); double rsl5 = Math.sqrt(rsl3 + rsl4);
        return rsl5;
    }

    public static void main(String[] args) {
        double result = Point.distance(7,3,-5,3);
        System.out.println("result from (x1, y1) to (x2, y2) " + result);
    }
}
