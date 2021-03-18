import ro.ase.cts.after.logger.LoggerV2;
import ro.ase.cts.before.classes.CommandLine;
import ro.ase.cts.before.classes.GUI;

public class NewMain {
    public static void main(String[] args){
        //System.out.println("Hello world!");
        Runnable r = ()->{
            GUI gui = new GUI();
        };
        new Thread(r).start();;
        CommandLine commandLine = new CommandLine();

        LoggerV2.INSTANCE.log("Message from NewMain");
    }
}
