package ro.ase.cts.before.logger;

import java.io.*;
import java.util.Date;

public class Logger {
    private static Logger instance= null;
    private String fileName;
    public static final String WARNING_MESSAGE = "The already created instance will be used!";

    public  Logger(){
        this.fileName = "log.txt";
    }

    public  Logger(String fileName){
        this();
        if(fileName != null){
            this.fileName = fileName;
        }
    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        } else {
            System.out.println(WARNING_MESSAGE);
        }
        return instance;
    }

    public static synchronized Logger getInstance(String fileName){
        if(instance == null){
            instance = new Logger(fileName);
        } else {
            System.out.println(WARNING_MESSAGE);
        }
        return instance;
    }

    public void  log(String message) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
            Thread.sleep(4000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write( String.valueOf(new Date()));
            bufferedWriter.write("");
            bufferedWriter.write(message);
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.close();
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

