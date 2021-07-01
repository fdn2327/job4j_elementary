package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        return Math.sqrt(((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c))*0.5);
    }

    public static void main(String[] args) {
        double S = TrgArea.area(3,5,4);
        System.out.println(S);
    }
}
