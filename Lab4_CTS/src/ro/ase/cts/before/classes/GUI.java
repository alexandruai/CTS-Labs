package ro.ase.cts.before.classes;

import ro.ase.cts.after.logger.Logger;

import java.io.IOException;

public class GUI {

    public GUI() throws IOException {
        Logger logger = new Logger();
        logger.log("GUI created");
    }
}
