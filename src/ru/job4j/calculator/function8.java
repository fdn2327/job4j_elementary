package ru.job4j.calculator;

public class function8 {
    public static double f8(double x) {
        return(Math.pow(x,3)-(5*x)+1);
    }
    public static void main(String[] args) {
        double y = function8.f8(5);
        System.out.println(y);
    }
}
