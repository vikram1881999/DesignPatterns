package Patterns.Adapter;

public class ICCIBankAdapter implements BankApi {

  private ICCIBankAPI bankApi;
  
  public ICCIBankAdapter() {
    this.bankApi = new ICCIBankAPI();
  }

  @Override
  public double getBalance(String accountNumber) {
    return bankApi.getAccountBalance(accountNumber);
  }

  @Override
  public boolean sendMoney(String fromAcc, String toAcc, double amount) {
    return bankApi.transferMoney(fromAcc, toAcc, amount);
  }
  
}
