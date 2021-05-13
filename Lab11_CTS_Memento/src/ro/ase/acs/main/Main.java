package ro.ase.acs.main;

import ro.ase.acs.memento.Joc;

public class Main {
    public static void main(String[] args) {
        Joc joc = new Joc();
        joc.adaugaX(0, 0);
        joc.adaugaO(1, 1);
        joc.adaugaX(2, 2);
        joc.afisareTabla();
        try {
            joc.salvareTablaJoc();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        joc.adaugaO(2, 0);
        try {
            joc.salvareTablaJoc();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        joc.afisareTabla();
        joc.adaugaX(0, 2);
        joc.afisareTabla();
        joc.restaurare();
        joc.afisareTabla();

    }
}
