package Controller;

import View.CommandProcessor;

public class StartProgram {

    CommandProcessor commandProcessor = new CommandProcessor();

    public StartProgram() {
    }


    public void run() {

        commandProcessor.run();
    }
}
