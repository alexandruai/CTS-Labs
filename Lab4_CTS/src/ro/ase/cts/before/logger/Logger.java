package ro.ase.cts.before.logger;

import java.io.*;
import java.util.Date;

public class Logger {
    private String fileName;

    public  Logger(){
        this.fileName = "log.txt";
    }

    public  Logger(String fileName){
        this();
        if(fileName != null){
            this.fileName = fileName;
        }
    }

    public void  log(String message) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write( String.valueOf(new Date()));
            bufferedWriter.write("");
            bufferedWriter.write(message);
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

