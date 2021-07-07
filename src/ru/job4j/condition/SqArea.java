package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return k * Math.pow((p / (2 * k + 2)), 2);
    }

    public static void main(String[] args) {
        double s = SqArea.square(6, 2);
        System.out.println(s);
    }
}
