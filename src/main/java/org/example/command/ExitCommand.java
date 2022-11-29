package org.example.command;

public class ExitCommand extends Command{
    public static final String name = "exit";
    @Override
    public boolean execute() {
        System.exit(0);
        return true;
    }
}
