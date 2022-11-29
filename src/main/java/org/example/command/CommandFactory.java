package org.example.command;

public class CommandFactory {
    public static Command getCommand(String command){
        switch (command.toLowerCase()){
            case ExitCommand.name:
                return new ExitCommand();
            case AllCommand.name:
                return new AllCommand();
            case OrderCommand.name:
                return new OrderCommand();
            case InfoCommand.name:
                return new InfoCommand();
            case ShowCommand.name:
                return new ShowCommand();
            case PayCommand.name:
                return new PayCommand();
            case DeleteCommand.name:
                return new DeleteCommand();
            case DeleteAllCommand.name:
                return new DeleteAllCommand();
            case SkiPayCommand.name:
                return new SkiPayCommand();
            case HousePayCommand.name:
                return new HousePayCommand();
        }
        return null;
    }
}
