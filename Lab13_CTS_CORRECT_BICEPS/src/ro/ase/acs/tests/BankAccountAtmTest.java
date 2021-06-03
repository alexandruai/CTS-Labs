package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.exceptions.NotEnoughFounds;
import ro.ase.acs.models.BankAccount;
import ro.ase.acs.models.IAtm;

import java.util.Random;

import static org.junit.Assert.assertEquals;

//Stub
class AtmStub implements IAtm {
    //clasa poate fi folosita doar de testele respective

    private Random random = new Random();
    public float value = 0;
    @Override
    public float transaction() {
        value = random.nextInt(2001);
        return value;
    }


}
public class BankAccountAtmTest {

    //Test cu fake, valori hardcoded
    @Test
    public void testWithdraw() throws NotEnoughFounds {
        BankAccount bankAccount = new BankAccount();
        bankAccount.addTransaction(1000f);
        bankAccount.setAtm(new IAtm(){

            @Override
            public float transaction() {
                return -500;
            }
        });

        bankAccount.useAtm();
        bankAccount.setAtm(() -> -400);

        bankAccount.useAtm();
        float balance = bankAccount.getBalance();
        assertEquals("ATM not working", 100f, balance, 0.001f);
    }

    //Stub
    @Test
    public void testDeposit() throws NotEnoughFounds {
        BankAccount bankAccount = new BankAccount();
        AtmStub atmStub = new AtmStub();
        bankAccount.setAtm(atmStub);

        bankAccount.useAtm();
        float balance = bankAccount.getBalance();
        assertEquals("ATM not working", atmStub.value, balance, 0.001f);
    }
}
