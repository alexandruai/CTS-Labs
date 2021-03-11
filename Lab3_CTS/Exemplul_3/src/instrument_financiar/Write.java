package instrument_financiar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Write {

    public static void writeFile(ArrayList<Instrument> lista){

        FileWriter outFile = null;
        BufferedWriter writer = null;

        try {
            outFile = new FileWriter("instrumenteFinanciare.csv", false);
            writer = new BufferedWriter(outFile);

                for (Instrument i:lista) {
                    System.out.println(i.toString());
                    writer.write(i.toString());
                    writer.newLine();
                }

                writer.close();
                outFile.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

}
