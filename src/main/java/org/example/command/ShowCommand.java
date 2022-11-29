package org.example.command;

import org.example.entity.Order;
import org.example.entity.Purchase;
import org.example.entity.ResortHouse;
import org.example.entity.Ski;

import java.util.List;

public class ShowCommand extends Command{
    public static final String name = "show";
    @Override
    public boolean execute() {
        List<Purchase> purchases = Order.getPurchases();
        if (purchases==null || purchases.isEmpty()){
            System.out.println("Ви нічого не вибрали");
            return false;
        } else {
            int index = 0;
            for (Purchase purchase:Order.getPurchases()){
                System.out.println("№" + index++ + "-----------------------------");
                System.out.println("Назва : " + purchase.getName());
                System.out.println("Ціна : " + purchase.getCost() + " грн.");
                if (purchase instanceof ResortHouse)
                    System.out.println("Кількість кімнат : " + ((ResortHouse) purchase).getNumberOfRooms() + "шт.");
                if (purchase instanceof Ski)
                    System.out.println("Довжина лиж : " + String.format("%.2f",((Ski) purchase).getLength()) + " см.");
                System.out.println("--------------------------------");
            }
        }
        return true;
    }
}
