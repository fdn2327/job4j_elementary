package ru.job4j.calculator;

public class function3 {
    public static double f3(float x) {
        return (1 / x) - (1 / Math.pow(x, 2)) - (1 / Math.pow(x, 3));
    }
    public static void main(String[] args) {
        double y = function3.f3(5);
        System.out.println(y);
    }
}
