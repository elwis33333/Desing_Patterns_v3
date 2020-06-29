package main.java.command.commands;

import main.java.command.fs.FileSystemReceiver;

public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.writeFile();
    }

}
