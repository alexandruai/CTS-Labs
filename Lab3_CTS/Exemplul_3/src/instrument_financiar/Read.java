package instrument_financiar;

import Data.Status;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Read {

    public static void read(ArrayDeque<Instrument> coada){

        FileReader inFile = null;
        BufferedReader reader = null;

        try {
                inFile = new FileReader("instrumenteFinanciare.csv");
                reader = new BufferedReader(inFile);

                Scanner fileScanner = new Scanner(reader);
                while(fileScanner.hasNext()) {
                    String linie = fileScanner.nextLine();
                    Scanner lineScanner = new Scanner(linie);
                    lineScanner.useDelimiter(",");

                    Instrument local = new Instrument();
                    local.setSimbol(lineScanner.next());
                    local.setNume(lineScanner.next());


                    local.setPret(lineScanner.nextDouble());
                    local.setStare(Status.valueOf(lineScanner.next()));

                    coada.offerLast(local);

                    reader.close();
                    inFile.close();
                 }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Instrument iter = null;
        while(!coada.isEmpty()) {
            iter = coada.pollFirst();
            System.out.println(iter.toString());
        }

    }

}
