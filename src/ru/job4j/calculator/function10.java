package ru.job4j.calculator;

public class function10 {
    public static double f10(int x) {
        return(Math.pow(x,4)-(5*x)+1);
    }
    public static void main(String[] args){
        double y = function10.f10(2);
        System.out.println(y);
    }
}
