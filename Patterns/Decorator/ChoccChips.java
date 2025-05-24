package Patterns.Decorator;

public class ChoccChips implements IceCreram {

  private IceCreram iceCreram;

  public ChoccChips( IceCreram iceCreram ) {
    this.iceCreram  = iceCreram;
  }

  @Override
  public int getPrice() {
    if( iceCreram != null ) {
      return iceCreram.getPrice() + 29;
    }
    return 29;
  }

  @Override
  public String getDescription() {
    if( iceCreram != null  ){
      return iceCreram.getDescription() + " + ChocoChips";
    }
    return "ChocoChips";
  }
  
}
