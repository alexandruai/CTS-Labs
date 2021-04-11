import ro.ase.cts.after.logger.LoggerV2;
import ro.ase.cts.after.logger.LoggerV3;
import ro.ase.cts.before.classes.CommandLine;
import ro.ase.cts.before.classes.GUI;

import java.io.IOException;

public class NewMain {
    public static void main(String[] args){
        //System.out.println("Hello world!");
        Runnable r = ()->{
            try {
                GUI gui = new GUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        new Thread(r).start();;
        try {
            CommandLine commandLine = new CommandLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        LoggerV2.INSTANCE.log("Message from NewMain");
        LoggerV3.instance.log("Another message from NewMain");
    }
}
