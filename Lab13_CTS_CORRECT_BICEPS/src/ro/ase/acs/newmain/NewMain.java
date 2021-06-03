package ro.ase.acs.newmain;

import ro.ase.acs.exceptions.NotEnoughFounds;
import ro.ase.acs.models.Atm;
import ro.ase.acs.models.BankAccount;

public class NewMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAtm(new Atm());
        try {
            bankAccount.useAtm();
            System.out.println(bankAccount.getBalance());
        } catch (NotEnoughFounds notEnoughFounds) {
            notEnoughFounds.printStackTrace();
        }
    }
}
