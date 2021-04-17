package ro.ase.acs.factorymethode;

import ro.ase.acs.simplefactory.Document;

public class OpenOfficeSpreadSheet implements Document {

    private String name;

    public OpenOfficeSpreadSheet(String name) {
        this.name = name;
    }

    @Override
    public void open() {

        System.out.println(String.format("The document %s.ods is opening...",name));

    }
}
