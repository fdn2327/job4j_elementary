package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, you are " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        String age = "33";

        ArgMethod.hello(" ");

        ArgMethod.hello(name); ArgMethod.hello(age);

        ArgMethod.hello(age);

        ArgMethod.hello(name); ArgMethod.hello(name); ArgMethod.hello(name);
    }
}