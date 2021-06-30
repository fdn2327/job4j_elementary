package ru.job4j.calculator;

public class function1 {
    public static double f1 (float x){
    return 2*(Math.pow(x,4)/3)-(2*x)+3;
    }
public static void main(String[] args) {
        double y = function1.f1(1);
        System.out.println(y);
}
}
