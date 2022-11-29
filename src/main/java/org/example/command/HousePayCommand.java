package org.example.command;

import org.example.service.ResortHouseService;
import org.example.service.Service;

public class HousePayCommand extends Command{
    public static final String name = "housepay";
    @Override
    public boolean execute() {
        Service service = new Service();
        service.setService(new ResortHouseService());
        System.out.println("Загальна ціна за будинки : " + service.getCost());
        return false;
    }
}
