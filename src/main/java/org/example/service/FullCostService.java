package org.example.service;

import org.example.entity.Order;
import org.example.entity.Purchase;

import java.util.List;

public class FullCostService implements ServiceStrategy {
    @Override
    public double getCost() {
        double value = 0;
        List<Purchase> purchases = Order.getPurchases();
        for (int i = 0; i != purchases.size();i++){
            value += purchases.get(i).getCost();
        }
        return value;
    }
}
