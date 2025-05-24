package Patterns.Observer;

public class Client {
  public static void main( String[] args ) {
    Flipkart flipkart = Flipkart.getInstance();
    InventoryService inventoryService = new InventoryService(flipkart);
    EmailService emailService = new EmailService(flipkart);
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
    flipkart.placeOrder();
  }
  
}
