package ro.ase.acs.factorymethode;

import ro.ase.acs.simplefactory.Document;
import ro.ase.acs.simplefactory.NoSuchDocumentException;
import ro.ase.acs.simplefactory.OpenOfficeWord;

public class OpenOfficeFactory implements DocumentFactory{
    @Override
    public Document getDocument(DocumentType documentType, String name) throws NoSuchDocumentException {
        if(documentType == DocumentType.TEXT_EDITOR){
            return new OpenOfficeWord(name);
        } else if(documentType == DocumentType.SPREADSHEET){
            return new OpenOfficeSpreadSheet(name);
        }
        throw new NoSuchDocumentException();
    }
}
