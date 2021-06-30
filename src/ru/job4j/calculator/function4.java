package ru.job4j.calculator;

public class function4 {
    public static float f4(float x){
        return (x-1)/(x+1);
    }

    public static void main(String[] args) {
        float y = function4.f4(3);
        System.out.println(y);
    }
}
