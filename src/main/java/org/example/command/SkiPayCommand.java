package org.example.command;

import org.example.service.ResortHouseService;
import org.example.service.Service;
import org.example.service.SkiCostService;

public class SkiPayCommand extends Command{
    public static final String name = "skipay";
    @Override
    public boolean execute() {
        Service service = new Service();
        service.setService(new SkiCostService());
        System.out.println("Загальна ціна за лижі : " + service.getCost());
        return false;
    }
}
