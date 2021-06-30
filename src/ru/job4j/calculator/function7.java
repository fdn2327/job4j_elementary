package ru.job4j.calculator;

public class function7 {
    public static double f7(double x) {
        return(Math.pow(x,6)-((3*Math.pow(x,2)))+x-1);
    }
    public static void main(String[] args) {
        double y = function7.f7(1);
        System.out.println(y);
    }
}
