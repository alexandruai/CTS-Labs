import ro.ase.cts.before.classes.CommandLine;
import ro.ase.cts.before.classes.GUI;

import java.io.IOException;

//Singleton
public class Main {
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
    }
}
