package Patterns.Adapter;

public class YesBankAdapter implements BankApi{

  YesBankApi api;
  public YesBankAdapter() {
    this.api = new YesBankApi();
  }

  @Override
  public double getBalance(String accountNumber) {
    return api.getAccountBalance(accountNumber);
  }

  @Override
  public boolean sendMoney(String fromAcc, String toAcc, double amount) {
    return api.transferMoney(fromAcc, toAcc, amount);
  }
  
}
