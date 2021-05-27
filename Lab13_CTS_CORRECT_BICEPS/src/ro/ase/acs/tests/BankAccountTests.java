package ro.ase.acs.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import ro.ase.acs.exceptions.NotEnoughFounds;
import ro.ase.acs.models.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountTests {

    private BankAccount bankAccount;

    @Before
    public void setUp(){
        bankAccount = new BankAccount();
    }

    //CORRECT
    @Test
    public void testConformance() throws NotEnoughFounds {
        BankAccount bankAccount = new BankAccount();
        bankAccount.addTransaction(300.331f);
        bankAccount.addTransaction(100.667f);
        bankAccount.addTransaction(0.01f);

        float result = bankAccount.getBalance();
        assertEquals("The balance is not right", 401f, result, 0.001f);
    }

    @Test
    public void testOrdering() throws NotEnoughFounds {
        bankAccount.addTransaction(200f);
        bankAccount.addTransaction(200f);
        bankAccount.addTransaction(-100f);

        float result = bankAccount.getBalance();
        assertEquals("The balance is not right", 300, result, 0.001f);
    }

    //Aici vrem intentionat sa vedem soldul prost
    //Daca unul crapa se termina functia, asa ca ii bag pe toti in try/ catch
    @Test
    public void testOrdering2() {
        try {
            bankAccount.addTransaction(-100f);
        } catch (NotEnoughFounds notEnoughFounds) {
            notEnoughFounds.printStackTrace();
        }
        try {
            bankAccount.addTransaction(200f);
        } catch (NotEnoughFounds notEnoughFounds) {
            notEnoughFounds.printStackTrace();
        }
        try {
            bankAccount.addTransaction(200f);
        } catch (NotEnoughFounds notEnoughFounds) {
            notEnoughFounds.printStackTrace();
        }

        float result = bankAccount.getBalance();
        assertEquals("The balance is not right", 400, result, 0.001f);
    }

    @Test
    public void testRange() throws NotEnoughFounds {
        bankAccount.addTransaction(1900f);
        bankAccount.addTransaction(-1800f);
        bankAccount.addTransaction(3000f);
        bankAccount.addTransaction(2000f);
        bankAccount.addTransaction(-2050f);
        bankAccount.addTransaction(0f);

        List<Float> transactions = bankAccount.getTransactions();
        assertTrue("Invalid transaction accepted", transactions.contains(1900f));
        assertTrue("Invalid transaction accepted", transactions.contains(-1800f));
        assertFalse("Invalid transaction accepted", transactions.contains(3000f));
        assertFalse("Invalid transaction accepted", transactions.contains(-2050f));
        assertFalse("Invalid transaction accepted", transactions.contains(0f));
    }

    @Test
    public void testReferance(){
        List<Float> transactions = new ArrayList<>();
        transactions.add(300f);
        transactions.add(-150f);
        transactions.add(400f);

        bankAccount.restoreTransaction(transactions);
        transactions.add(200f);
        float result = bankAccount.getBalance();
        assertEquals("Invalid transaction", 550f, result, 0.01f);
    }

    @Test
    public void testCardinality() {
       float comparable = bankAccount.getBalance();
       assertEquals("Balance is not correct",0f, comparable, 0.001f);
    }

    @Test
    public void testCardinality2() throws NotEnoughFounds {
        bankAccount.addTransaction(100f);
        float comparable = bankAccount.getBalance();
        assertEquals("Balance is not correct",100f, comparable, 0.001f);
    }

    @Test
    public void testCardinality3() throws NotEnoughFounds {
     for(int i = 0; i < 500; i++){
         bankAccount.addTransaction(100f);
     }

     for(int i = 0; i < 500; i++){
         bankAccount.addTransaction(-100f);
     }
        float comparable = bankAccount.getBalance();
        assertEquals("Balance is not correct",0f, comparable, 0.001f);
    }

    @Test(timeout = 1000)
    public void testTimeFrame() throws NotEnoughFounds {
        for(int i = 0; i < 100; i++){
            bankAccount.addTransaction(100f);
        }
        bankAccount.getBalance();

    }

    @Test
    public void testRight() throws NotEnoughFounds {
        bankAccount.addTransaction(100.55f);
        bankAccount.addTransaction(50.33f);
        bankAccount.addTransaction(-79.82f);
        bankAccount.addTransaction(-45.43f);

        float result = bankAccount.getBalance();
        assertEquals("The balance is incorect!", 25.63, result, 0.001f);
    }

    // BICEP
    @Test
    public void testBoundary1() throws NotEnoughFounds {
        bankAccount.addTransaction(2000f);
        bankAccount.addTransaction(-2000f);

        float result = bankAccount.getBalance();
        assertEquals("Incorrect bounds!", 0, result, 0.001f);
    }

    @Test
    public void testBoundary2() throws NotEnoughFounds {
        bankAccount.addTransaction(2000f);
        bankAccount.addTransaction(2000f);
        bankAccount.addTransaction(-2001f);
        bankAccount.addTransaction(2001f);

        float result = bankAccount.getBalance();
        assertEquals("Incorrect bounds!", 4000f, result, 0.001f);
    }

    @Test
    public void testInverse() throws NotEnoughFounds{
        bankAccount.addTransaction(100.55f);
        bankAccount.addTransaction(50.33f);
        bankAccount.addTransaction(-79.82f);
        bankAccount.addTransaction(-45.43f);

        float result = bankAccount.getBalance();
        List<Float> transactions = bankAccount.getTransactions();

        for(int i = transactions.size()-1; i>= 0; i--) {
            result -= transactions.get(i);
        }

        assertEquals("Incorrect", 0, result, 0.001f);
    }

    @Test
    public void testCrossCheck() throws NotEnoughFounds {
        bankAccount.addTransaction(100.55f);
        bankAccount.addTransaction(50.33f);
        bankAccount.addTransaction(-79.82f);
        bankAccount.addTransaction(-45.43f);

        float result = bankAccount.getBalance();
        List<Float> transactions = bankAccount.getTransactions();

        float expected = (float) transactions.stream().mapToDouble(x->(double)x).sum();
        assertEquals("Balance is incorrect", expected, result, 0.001f);
    }

    @Test(expected = NotEnoughFounds.class)
    public void testErrorCondition() throws NotEnoughFounds{
        bankAccount.addTransaction(300f);
        bankAccount.addTransaction(-350f);
    }

    @Test(timeout = 10)
    public void testPerformance() throws NotEnoughFounds {
        bankAccount.addTransaction(777f);

    }
}
