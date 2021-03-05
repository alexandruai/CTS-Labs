package ro.ase.acs.main;

import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.readers.Readable;
import ro.ase.acs.services.Orchestrator;
import ro.ase.acs.writers.FileWriter;
import ro.ase.acs.writers.Writeable;

public class Main {

    public static void main(String[] args) {

//        //Se verifica S => clasa nu mai are motive sa se schimbe
//        ConsoleReader reader = new ConsoleReader();
//        Writeable writer = new FileWriter();
//        writer.write(reader.read());
//
//        try{
//            reader.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
 //       Orchestrator orchestrator = new Orchestrator(new ConsoleReader(), new ConsoleWriter());

        //Decuplare orchestrator
        //Impingi dependintele pana sus de tot( pana in Main)
        //Exercitiu / Tema -> Varianta mai eleganta
        IoC basicIoCConteiner = new IoC();
      //basicIoCConteiner.register(Writeable.class, ConsoleWriter.class);
        basicIoCConteiner.register(Readable.class, ConsoleReader.class);
        basicIoCConteiner.register(Writeable.class, FileWriter.class);

        Orchestrator orchestrator = new Orchestrator(basicIoCConteiner);
        orchestrator.execute();
    }
}
