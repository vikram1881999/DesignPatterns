package Patterns.DesignParkingLot.Model;

public class Payment extends BaseEntity {
  private Mode Mode;
  private int amount;
  private PaymentStatus paymentStatus;
  private String referenceId;

  public Mode getMode() {
    return Mode;
  }

  public void setMode(Mode Mode) {
    this.Mode = Mode;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public PaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }
}
