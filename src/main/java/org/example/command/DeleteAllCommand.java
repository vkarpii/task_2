package org.example.command;

import org.example.entity.Order;

public class DeleteAllCommand extends Command{
    public static final String name = "deleteall";
    @Override
    public boolean execute() {
        Order.deleteAll();
        System.out.println("Всі ваші замовлення видалені!");
        return true;
    }
}
