package ru.job4j.tracker.max;

public class Reduce {
    private int[] m;

    public void to(int[] array) {
         this.m = array;
    }

    public void print() {
        for (int index = 0; index < m.length; index++) {
            System.out.println(m[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
