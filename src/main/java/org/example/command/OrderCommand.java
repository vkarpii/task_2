package org.example.command;

import org.example.builder.ResortHouseBuilder;
import org.example.builder.SkiBuilder;
import org.example.entity.*;

import java.util.Scanner;

public class OrderCommand extends Command{
    public static final String name = "order";
    @Override
    public boolean execute() {
        System.out.println("Що бажаєте замовити?(Ski/House)");
        Scanner scanner = new Scanner(System.in);
        String orderCommand = scanner.nextLine();
        //Service service = new Service();
        Purchase purchase = null;

        if (orderCommand.equalsIgnoreCase("ski")){
            SkiBuilder builder = new SkiBuilder();
            builder.createNewSki();
            System.out.println("З якого матеріалу потрібні лижі?(Wood/Plastic)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Wood")){
                builder.setWoodMaterial();
            }
            if (choice.equalsIgnoreCase("Plastic")){
                builder.setPlasticMaterial();
            }
            System.out.println("Якого типу?(Junior/Sport/Universal)");//Common/Premium/Elite
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Junior")) {
                builder.setJuniorLength(Human.getHeight());
            }if (choice.equalsIgnoreCase("Sport")){
                builder.setSportLength(Human.getHeight());
            }
            if (choice.equalsIgnoreCase("Universal")){
                builder.setUniversalLength(Human.getHeight());
            }
            purchase = builder.getSki();
        }
        if (orderCommand.equalsIgnoreCase("house")){
            ResortHouseBuilder builder = new ResortHouseBuilder();
            builder.createResortHouse();
            System.out.println("Який тип ви хочете?\n1 кімната - Common \n2 кімнати - Premium\n3 кімнати - Elite");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Common")){
                builder.setCommonLevel();
            }
            if (choice.equalsIgnoreCase("Premium")){
                builder.setPremiumLevel();
            }
            if (choice.equalsIgnoreCase("Elite")){
                builder.setEliteLevel();
            }
            purchase = builder.getResortHouse();
        }
        if (purchase != null){
            Order.addPurchase(purchase);
            System.out.println("Новий товар : " + purchase.getName() + "| Ціна : " + purchase.getCost());
        } else {
            System.err.println("Ви ввели некоректні дані! Спробуйте створити замовлення ще раз!");
        }
        return false;
    }
}
