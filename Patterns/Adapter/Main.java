package Patterns.Adapter;

public class Main {

  public static void main( String[] args ) {
    PhonePe phonePe = new PhonePe(new ICCIBankAdapter());
    phonePe.sendMoney("d", "s", 20);
  }
  
}
