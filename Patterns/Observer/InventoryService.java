package Patterns.Observer;

public class InventoryService implements OnOrderPlacedSubscriber {

  public InventoryService( Flipkart flipkart ) {
    flipkart.registerOnOrderPlaceSubscriber(this);
  }

  @Override
  public void onOrderPlace() {
    System.out.println( "Updating Inventory");
  }

}
