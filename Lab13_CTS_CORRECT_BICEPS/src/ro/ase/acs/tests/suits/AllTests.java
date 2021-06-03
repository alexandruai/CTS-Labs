package ro.ase.acs.tests.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.BankAccountAtmTest;
import ro.ase.acs.tests.BankAccountTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({BankAccountTests.class, BankAccountAtmTest.class})

public class AllTests {

}
