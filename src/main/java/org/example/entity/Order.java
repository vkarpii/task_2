package org.example.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private static List<Purchase> purchases;
    static {
        purchases = new ArrayList<>();
    }
    public static void addPurchase(Purchase purchase){
        purchases.add(purchase);
    }
    public static List<Purchase> getPurchases(){
        return purchases;
    }

    public static void deleteAll() {
        purchases = new ArrayList<>();
    }
    public static void deleteByIndex(int index) {
        try {
            purchases.remove(index);
        } catch (NullPointerException e){
            System.out.println("Ви ввели невірний індекс!");
        }

    }
}
