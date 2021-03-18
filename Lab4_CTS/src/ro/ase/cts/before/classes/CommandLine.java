package ro.ase.cts.before.classes;


import ro.ase.cts.before.logger.Logger;

public class CommandLine {
        public CommandLine(){
            Logger logger = Logger.getInstance("log.txt");
            logger.log("command line created");
        }
}
