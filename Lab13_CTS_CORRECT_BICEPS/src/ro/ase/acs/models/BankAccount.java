package ro.ase.acs.models;

import ro.ase.acs.exceptions.NotEnoughFounds;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    String owner;
    String IBan;
    List<Float> transactions;
    IAtm atm;

    public BankAccount() {
        this.transactions = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIBan() {
        return IBan;
    }

    public void setIBan(String IBan) {
        this.IBan = IBan;
    }

    public List<Float> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Float> transactions) {
        this.transactions = transactions;
    }

    public void setAtm(IAtm atm) {
        this.atm = atm;
    }

    public void useAtm() throws NotEnoughFounds {
        if(atm != null){
            float value = atm.transaction();
            addTransaction(value);
        }
    }

    public void addTransaction(float value) throws NotEnoughFounds {
        if(-value > getBalance()){
                throw new NotEnoughFounds();
        }

        if(value <= 2000f && value >= -2000f && value != 0){
            transactions.add((float) (Math.floor(value * 100)/ 100));
        }

    }

    public  float getBalance(){
        float balance = 0;
        for(float s : transactions){
            balance += s;
        }
        return balance;
    }

    //Lista interna vs Lista externa
    // Shallow copy vs Deep copy
    public void restoreTransaction(List<Float> transactions){
        this.transactions.clear();
        for (Float transaction : transactions) {
            this.transactions.add(transaction);
        }
    }
}
