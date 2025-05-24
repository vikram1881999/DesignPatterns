package Patterns.Strategy;

public class Main {

  public static void main( String[] args ) {
    GooogleMaps gooogleMaps = new GooogleMaps();

    System.out.println(gooogleMaps.pathFromSourceTODestination("Gwalior","Nagaur", "Car"));
  }
  
}
