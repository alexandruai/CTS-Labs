package ro.ase.acs.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> observerList = new ArrayList<>();

    public void abonareNewsletter(Observer observer) {
        observerList.add(observer);
    }

    public void dezabonareNewsLetter(Observer observer) {
        observerList.remove(observer);
    }

    public void trimiteMail(String subiect) {
        for (Observer observer : observerList) {
            observer.primesteMail(subiect);
        }
    }
}
