package Patterns.Decorator;

public class OrangeCone implements IceCreram {

  @Override
  public int getPrice() {
    return 49;
  }

  @Override
  public String getDescription() {
    return "Orange Cone";
  }
  
}
