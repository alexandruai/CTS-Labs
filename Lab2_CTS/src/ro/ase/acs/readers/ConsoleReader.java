package ro.ase.acs.readers;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleReader implements Closeable, Readable{

    //Closeable ca sa poti pune in try catch scanner.close()

    private  Scanner scanner = new Scanner(System.in);
    public String read(){
        System.out.print("Message: ");
        String message = scanner.nextLine();
        return  message;
    }


    @Override
    public void close() throws IOException {
        scanner.close();
    }
}
