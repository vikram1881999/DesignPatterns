package Patterns.Decorator;

public class StrawberryScope implements IceCreram {

  private IceCreram creram;

  public StrawberryScope( IceCreram creram ) {
    this.creram = creram;
  }

  @Override
  public int getPrice() {
    if( creram != null ) {
      return creram.getPrice() + 79;
    }
    return 79;
  }

  @Override
  public String getDescription() {
    if( creram != null ) {
      return creram.getDescription() + " + strawberry scope";
    }

    return "StrawberryScope";
  }
  
}
