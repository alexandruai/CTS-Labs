package ro.ase.cts.after.classe;

import ro.ase.cts.after.logger.Logger;

import java.io.IOException;

public class CommandLine {

    public CommandLine() throws IOException {
            Logger logger = Logger.getInstance("log.txt");
        logger.log("Command Line created");
    }

}
