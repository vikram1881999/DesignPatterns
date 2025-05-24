package Patterns.Adapter;

public class PhonePe {

  BankApi  bankApi;

  public PhonePe( BankApi api ) {
    this.bankApi = api;
  }

  public double checkBalance( String accoutNumber ) {
    return bankApi.getBalance( accoutNumber);
  }

  public boolean sendMoney( String from, String to, double amount ){
    return bankApi.sendMoney(from, to, amount);
  }
  
}
