package org.example.app;

import org.example.command.Command;
import org.example.command.CommandFactory;
import org.example.entity.Human;

import java.util.Scanner;

public class App {
    private Scanner scanner;
    public App(){
        scanner = new Scanner(System.in);
    }
    private void registerHuman(){
        System.out.println("Доброго дня, якe Ваше ім'я?");
        Human.setFirstName(scanner.nextLine());
        System.out.println("Якe Ваше прізвище?");
        Human.setLastName(scanner.nextLine());
        System.out.println("Який Ваш зріст(в см)?");
        Human.setHeight(scanner.nextDouble());
        scanner.nextLine();
    }
    public void start(){
        registerHuman();

        while (true){
            System.out.print("\nВведіть команду (all - подивитись всі команди):\n=>");
            String commandLine = scanner.nextLine();
            Command command = CommandFactory.getCommand(commandLine);
            if (command != null)
                command.execute();
            else
                System.out.println("Команда не знайдена!");
        }

    }
}
