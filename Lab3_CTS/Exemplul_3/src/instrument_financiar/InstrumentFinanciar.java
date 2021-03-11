package instrument_financiar;

import Data.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class InstrumentFinanciar {

    public static void main(String[] args) {
        Instrument instr1 = new Instrument("BRD",
                "Banca Romana pentru Dezvoltare", 12.78, Status.TRANZACTIONABIL);
        Instrument instr2 = new Instrument("TLV",
                "Banca Transilvania", 7.34, Status.TRANZACTIONABIL);
        Instrument instr3 = new Instrument("BVB",
                "Bursa de Valori Bucuresti", 24.6, Status.NETRANZACTIONABIL);

        ArrayList<Instrument> lista = new ArrayList<Instrument>();
        lista.add(instr1);
        lista.add(instr2);
        lista.add(instr3);

        Write.writeFile(lista);

        ArrayDeque<Instrument> coada = new ArrayDeque<Instrument>();

        Read.read(coada);
    }

}
