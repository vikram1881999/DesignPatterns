package Patterns.Decorator;

public class VanillaScoop implements IceCreram {

  private IceCreram iCreram;

  public VanillaScoop( IceCreram creram ) {
    this.iCreram = creram;
  }

  @Override
  public int getPrice() {
    if( iCreram != null ) {
      return iCreram.getPrice() + 90;
    }
    throw new RuntimeException(" Vanilla Scoop requires base cone ");
  }

  @Override
  public String getDescription() {
    if( iCreram != null ) {
      return iCreram.getDescription() + " + Vanilla Scoop";
    }
    throw new RuntimeException(" Vanilla Scoop requires base cone ");
  }
  
}
