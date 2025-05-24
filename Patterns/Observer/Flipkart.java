package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

  public static Flipkart instance = null;

  private List<OnOrderPlacedSubscriber> orderPalcedSubscriber = null;

  private Flipkart() {

  }

  public static Flipkart getInstance( ) {
    if( instance == null ) {
      synchronized( Flipkart.class ) {
        if( instance == null ) {
          instance  = new Flipkart();
        }
      }
    }
    return instance;
  }

  public void registerOnOrderPlaceSubscriber( OnOrderPlacedSubscriber onOrderPlacedSubscriber ) {
    if( orderPalcedSubscriber == null ) {
      orderPalcedSubscriber = new ArrayList<>();
    }
    orderPalcedSubscriber.add(onOrderPlacedSubscriber);
  }

  public void placeOrder( ) {
    if( orderPalcedSubscriber != null  ){
      for( OnOrderPlacedSubscriber onOrderPlacedSubscriber: orderPalcedSubscriber ) {
        onOrderPlacedSubscriber.onOrderPlace();
      }
    }
  }
  
}
