package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        System.out.println("Что ты хочешь узнать? ");
        String i = s.nextLine();
        switch (answer) {
            case 0 -> System.out.println("Да");
            case 1 -> System.out.println("Нет");
            default -> System.out.println("Может быть");
        };
    }
}
