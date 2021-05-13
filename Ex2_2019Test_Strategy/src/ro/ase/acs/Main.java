package ro.ase.acs;

public class Main {

    public static void main(String[] args) {

        Imobiliare imobil1 = new Imobiliare(new TranzactiaCumpara(), TipImobiliar.CASA,
                "alea 33", 150, 5000);
        imobil1.platesteTranzactie();

        Imobiliare imobil2 = new Imobiliare(new TranzactiaInchiriere(), TipImobiliar.APARTAMENT,
                "alea 15", 150, 500);
        imobil2.platesteTranzactie();

    }

}
