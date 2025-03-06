package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@NetBanking")
public void netBankingSetup()
{
    System.out.println("***************");
    System.out.println("setup the entries in Netbanking database");
}

    @Before()
    public void beforeMethod()
    {
        System.out.println("***************");
        System.out.println("setup the entries in BeforeMethod");
    }

    @After
    public void tearDown()
    {
        System.out.println("clear the entries");
    }

    @Before("@Mortgage")
    public void mortgageSetup()
    {

        System.out.println("setup the entries in Mortgage database");
    }
}
// Before->Background-> Scenario-> After