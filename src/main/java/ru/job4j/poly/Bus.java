package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void passengers(int p) {
        System.out.println("В автобусе " + p + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * money;
    }

}

