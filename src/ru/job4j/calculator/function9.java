package ru.job4j.calculator;

public class function9 {
    public static double f9(double x) {
        return(Math.pow((x+1),3)-x);
    }
    public static void main(String[] args) {
        double y = function9.f9(2);
        System.out.println(y);
    }
}
