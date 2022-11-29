package org.example.command;

import org.example.service.FullCostService;
import org.example.service.ResortHouseService;
import org.example.service.Service;
import org.example.service.SkiCostService;

public class PayCommand extends Command{
    public static final String name = "pay";
    @Override
    public boolean execute() {
        Service service = new Service();
        service.setService(new FullCostService());
        System.out.println("Загальна ціна : " + service.getCost());
        return false;
    }
}
