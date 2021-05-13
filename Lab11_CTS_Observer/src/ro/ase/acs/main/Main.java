package ro.ase.acs.main;

import ro.ase.acs.observer.Abonat;
import ro.ase.acs.observer.Website;

public class Main {
    public static void main(String[] args) {
        Website website = new Website();
        website.setAdresa("myblog.com");
        Abonat abonat1 = new Abonat("gigel@gmail.com");
        Abonat abonat2 = new Abonat("dorel@gmail.com");
        Abonat abonat3 = new Abonat("giani@gmail.com");
        website.abonareNewsletter(abonat1);
        website.abonareNewsletter(abonat2);
        website.abonareNewsletter(abonat3);
        website.adaugaArticol("Articol nou");
        website.dezabonareNewsLetter(abonat3);
        website.adaugaArticol("Alt articol");
    }
}
