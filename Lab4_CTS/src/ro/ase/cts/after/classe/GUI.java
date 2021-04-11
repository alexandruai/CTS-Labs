package ro.ase.cts.after.classe;

import ro.ase.cts.after.logger.Logger;

import java.io.IOException;

public class GUI {

    public GUI() throws IOException {
        Logger logger = Logger.getInstance();
        logger.log("GUI created");
    }

}
