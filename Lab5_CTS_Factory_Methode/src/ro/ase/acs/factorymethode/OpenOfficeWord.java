package ro.ase.acs.factorymethode;

import ro.ase.acs.simplefactory.Document;

public class OpenOfficeWord implements Document {
    private String name;

    public OpenOfficeWord(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println(String.format("The document %s.odt is opening...",name));
    }
}
