package Patterns.Decorator;

public class Main {
  public static void main( String[] args ) {
    IceCreram creram = new ChoccChips(new VanillaScoop( new ChoccChips( new StrawberryScope( new  ChocclateCone( new OrangeCone())))));
    System.out.println( creram.getDescription());
    System.out.println( creram.getPrice());
  }
}
