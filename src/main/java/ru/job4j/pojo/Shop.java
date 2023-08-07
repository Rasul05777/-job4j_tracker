package ru.job4j.pojo;

public class Shop {
   public static int indexOfNull(Product[] products) {
       for (int i = 0; i < products.length; i++) {
           Product a = products[i];
           if(a == null) {
               return i;
           }
       } return - 1;
   }
}