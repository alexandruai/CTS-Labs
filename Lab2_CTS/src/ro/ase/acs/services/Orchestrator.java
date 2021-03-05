package ro.ase.acs.services;

import ro.ase.acs.main.IoC;
import ro.ase.acs.writers.Writeable;
import ro.ase.acs.readers.Readable;

public class Orchestrator {

    //Interface Segregacion
//    private Readable reader = new ConsoleReader();
//    private Writeable writer = new ConsoleWriter();
    private Readable reader;
    private Writeable writer;

    //Sol 1 pt Dependency Inversion: Constructor Inversion Conteiner
//    public Orchestrator(Readable reader, Writeable writer){
//        this.reader = reader;
//        this.writer = writer;
//    }

    //Tema refaci cu IoC
    //Sol 2 pt Dependency Inversion: IoC Container
    public Orchestrator(IoC basicContainer){
        this.reader = basicContainer.resolve(Readable.class);
        this.writer = basicContainer.resolve(Writeable.class);
    }

    public void execute(){
        writer.write(reader.read());
    }
}
