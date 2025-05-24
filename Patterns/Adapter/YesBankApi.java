package Patterns.Adapter;

public class YesBankApi {

  public double getAccountBalance( String accountNumber ) {
    return 338293.33;
  }

  public boolean transferMoney( String from, String to, double amount ) {
    double num =  Math.random()*2;
    if(  num < 1.0 ) {
      System.out.println("Failure");
      return false;
    }
    System.out.println( "transfer successful");
    return true;
  }
  
}
