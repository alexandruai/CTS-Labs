package ro.ase.acs.main;

import ro.ase.acs.factorymethode.Document;
import ro.ase.acs.factorymethode.DocumentFactory;
import ro.ase.acs.factorymethode.DocumentType;
import ro.ase.acs.factorymethode.OpenOfficeFactory;
import ro.ase.acs.simplefactory.NoSuchDocumentException;

public class NewMain {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new OpenOfficeFactory();
        try {
            ro.ase.acs.simplefactory.Document document = documentFactory.getDocument(DocumentType.SPREADSHEET,"studenti");
            document.open();
            ro.ase.acs.simplefactory.Document document2 = documentFactory.getDocument(DocumentType.TEXT_EDITOR,"proiect");
            document2.open();
        } catch (NoSuchDocumentException e) {
            e.printStackTrace();
        }
    }
}
