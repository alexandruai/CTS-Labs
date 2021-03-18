package ro.ase.cts.before.classes;

import ro.ase.cts.before.logger.Logger;

import java.io.IOException;

public class GUI {

    public GUI() throws IOException {
        Logger logger = Logger.getInstance();
        logger.log("GUI created");
    }
}
