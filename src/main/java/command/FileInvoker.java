package main.java.command;

import main.java.command.commands.Command;

public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void runCommand(Command c) {
        command = c;
        execute();
    }

    public void execute() {
        this.command.execute();
    }

}
