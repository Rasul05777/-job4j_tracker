package ru.job4j.ex;

public class Factorial {
    public int calc(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("A could not be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= a; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = new Factorial().calc(8);
        System.out.println(result);
    }
}
