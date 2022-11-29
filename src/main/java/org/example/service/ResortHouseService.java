package org.example.service;

import org.example.entity.Order;
import org.example.entity.Purchase;
import org.example.entity.ResortHouse;

import java.util.List;

public class ResortHouseService implements ServiceStrategy {
    @Override
    public double getCost() {
        double value = 0;
        List<Purchase> purchases = Order.getPurchases();
        for (int i = 0; i != purchases.size();i++){
            if (purchases.get(i) instanceof ResortHouse){
                value += purchases.get(i).getCost();
            }
        }
        return value;
    }
}
