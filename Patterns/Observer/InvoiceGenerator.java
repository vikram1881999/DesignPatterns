package Patterns.Observer;

public class InvoiceGenerator  implements OnOrderPlacedSubscriber {


  public InvoiceGenerator( Flipkart flipkart ) {
    flipkart.registerOnOrderPlaceSubscriber(this);
  }

  @Override
  public void onOrderPlace() {
    System.out.println( "Invoice Generated for order");
  }
    
}
