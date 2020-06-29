package main.java.command.commands;

import main.java.command.fs.FileSystemReceiver;

public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.closeFile();
    }

}
