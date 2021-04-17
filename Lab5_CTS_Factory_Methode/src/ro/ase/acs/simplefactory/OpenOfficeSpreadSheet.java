package ro.ase.acs.simplefactory;

public class OpenOfficeSpreadSheet implements  Document {

    private String name;

    public OpenOfficeSpreadSheet(String name) {
        this.name = name;
    }

    @Override
    public void open() {

        System.out.println(String.format("The document %s.ods is opening...",name));

    }
}
