package org.example.command;

import org.example.entity.Order;

import java.util.Scanner;

public class DeleteCommand extends Command{
    public static final String name = "delete";
    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        boolean result = new ShowCommand().execute();
        if (result){
            System.out.println("\nВведіть номер замовлення який хочете видалити:\n=>");
            int choice = scanner.nextInt();
            Order.deleteByIndex(choice);
            System.out.println("Замовлення №" + choice + " успішно видалено!");
        }
        return false;
    }
}
