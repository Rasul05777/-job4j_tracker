package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public static int devide(int i) {
        return i / x;
    }

    public int sumAllOperation(int i) {
        return sum(i) + multiply(i) + minus(i) + devide(i);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = calculator.sumAllOperation(7);
        int result1 = sum(15);
        int result2 = calculator.multiply(15);
        int result3 = minus(15);
        int result4 = devide(15);
        System.out.println(resultSum);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}