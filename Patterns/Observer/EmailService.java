package Patterns.Observer;

public class EmailService implements OnOrderPlacedSubscriber {

  public EmailService( Flipkart flipkart ) {
    flipkart.registerOnOrderPlaceSubscriber(this);
  }

  @Override
  public void onOrderPlace() {
    System.out.println( "Sending email");
  } 
  
}
