package Patterns.Decorator;

public class ChocclateCone implements IceCreram {

  private IceCreram iceCream;

  public ChocclateCone() {

  }

  public ChocclateCone( IceCreram creram ) {
    this.iceCream = creram;
  }

  @Override
  public int getPrice() {
    if( iceCream != null  ){
      return iceCream.getPrice() + 30;
    }

    return 30;
  }

  @Override
  public String getDescription() {
    if( iceCream != null ) {
      return iceCream.getDescription() + " +  Chocolate cone";
    }
    return "Chocolate COne";
  }
  
}
