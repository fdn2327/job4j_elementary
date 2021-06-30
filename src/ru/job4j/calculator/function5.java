package ru.job4j.calculator;

public class function5 {
    public static double f5(double x) {
        return(Math.pow(x,3)+(2*x)-8);
    }
    public static void main(String[] args) {
        double y = function5.f5(1);
        System.out.println(y);
    }
}
