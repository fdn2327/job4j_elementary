package ru.job4j.calculator;

public class function6 {
    public static double f6(float x) {
        return(Math.pow(x,4)-(3*x)+(4*x)-1);
    }
    public static void main(String[] args) {
        double y = function6.f6(2);
        System.out.println(y);
    }
}
