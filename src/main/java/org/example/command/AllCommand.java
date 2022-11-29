package org.example.command;

public class AllCommand extends Command{
    public static final String name = "all";
    @Override
    public boolean execute() {
        System.out.println("Список команд:" +
                "\nOrder - зробити замовлення" +
                "\nInfo - переглянути інформацію про себе" +
                "\nShow - переглянути всі замовлення" +
                "\nPay - розрахувати загальну суму" +
                "\nSkiPay - розрахувати суму всіх замовлених лиж" +
                "\nHousePay - розрахувати суму всіх замовлених будинків" +
                "\nDelete - видалити замовлення" +
                "\nDeleteAll - видалити всі замовлення" +
                "\nExit - завершити роботу програми");
        return true;
    }
}
