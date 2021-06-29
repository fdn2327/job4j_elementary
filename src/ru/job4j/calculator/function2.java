package ru.job4j.calculator;

public class function2 {
    public static double f2(double x, double a) {
        return -(Math.pow(x,5))/(Math.pow(a,2));
    }

    public static void main(String[] args) {
        double y = function2.f2(2,2);
        System.out.println(y);
    }
}
