package main.java.command;

import main.java.command.commands.CloseFileCommand;
import main.java.command.commands.OpenFileCommand;
import main.java.command.commands.ReadFileCommand;
import main.java.command.commands.WriteFileCommand;
import main.java.command.fs.FileSystemReceiver;
import main.java.command.fs.FileSystemReceiverUtil;

public class FileSystemClient {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating pattern.command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        ReadFileCommand readFileCommand = new ReadFileCommand(fs);
        file.runCommand(readFileCommand);


        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file.runCommand(writeFileCommand);

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file.runCommand(closeFileCommand);
    }

}
/*
 * dodać obsługe nowego systemu operacyjnego np. BadaOS
 * dodać nowy obiekt command np. licz zajętość miejca
 * pracę należy wykonać w podejściu TDD
 * wyniki do oceny dla trenera!!!
 */
