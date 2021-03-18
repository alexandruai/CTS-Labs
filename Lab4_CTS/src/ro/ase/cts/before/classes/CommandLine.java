package ro.ase.cts.before.gui;


import ro.ase.cts.before.logger.Logger;

import java.io.IOException;

public class CommandLine {
        public CommandLine(){
            Logger logger = Logger.getInstance("log.txt");
            logger.log("command line created");
        }
}
