package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c, double p) {
        p = ((a+b+c)/2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        double S = TrgArea.area(2,2,2,0);
        System.out.println(S);
    }
}
