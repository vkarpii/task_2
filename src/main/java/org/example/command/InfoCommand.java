package org.example.command;

import org.example.entity.Human;

public class InfoCommand extends Command{
    public static final String name = "info";
    @Override
    public boolean execute() {
        System.out.println("Ім'я : " + Human.getFirstName());
        System.out.println("Прізвище : " + Human.getLastName());
        System.out.println("Ріст : " + String.format("%.2f",Human.getHeight()));
        return false;
    }
}
