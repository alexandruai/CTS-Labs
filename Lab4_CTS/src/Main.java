import ro.ase.cts.before.classes.CommandLine;
import ro.ase.cts.before.classes.GUI;
//Singleton
public class Main {
    public static void main(String[] args){
        //System.out.println("Hello world!");
        Runnable r = ()->{
            GUI gui = new GUI();
        };
        new Thread(r).start();;
        CommandLine commandLine = new CommandLine();
    }
}
