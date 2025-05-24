package Patterns.Adapter;

public class ICCIBankAPI {

  public double getAccountBalance( String accountNumberr  ) {
    System.out.println( " ICCI Fetching acocount balance for accountnumber => " + accountNumberr);
    return Math.random()*1000000;
  }

  public boolean transferMoney( String from, String to, double amount ) {
    System.out.println( " ICCI transferring amount");
    return true; 
  }
}
