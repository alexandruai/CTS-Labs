package ro.ase.acs.factorymethode;

import ro.ase.acs.simplefactory.Document;
import ro.ase.acs.simplefactory.*;

public interface DocumentFactory {

    public Document getDocument(DocumentType documentType, String name) throws NoSuchDocumentException;

}
