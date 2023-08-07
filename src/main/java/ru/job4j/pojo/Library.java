package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Java", 350);
        Book python = new Book("Python", 200);
        Book javascript = new Book("Javascript", 300);
        Book clean = new Book("Clean code", 150);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = python;
        books[2] = javascript;
        books[3] = clean;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Replace java to clean");
        Book[] i = new Book[1];
        i[0] = java;
        books[0] = clean;
        books[3] = i[0];
        for (int j = 0; j < books.length; j++) {
            Book a = books[j];
            System.out.println(a.getName() + " - " + a.getPages());
        }
        System.out.println("Books with name : Clean code");
        if (java.equals("Clean code")) {
            System.out.println(java);
        }
        if (python.equals("Clean code")) {
            System.out.println(python);
        }
        if (javascript.equals("Clean code")) {
            System.out.println(javascript);
        }
        if (clean.equals("Clean code")) {
            System.out.println(clean);
        }

    }
}
