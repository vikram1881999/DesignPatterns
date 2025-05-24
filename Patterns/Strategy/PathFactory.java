package Patterns.Strategy;

public class PathFactory {


  public static PathSourceToDestination getPathToDestitionMode( String mode ) {
    if( mode.equalsIgnoreCase("walk") ) {
      return new PathSourceToDestinationWalk();
    }
    else if( mode.equalsIgnoreCase("car") ) {
      return new PathSourceToDestinationCar();
    }
    else if( mode.equalsIgnoreCase("bike")) {
      return new PathSourceToDestinationBike();
    }
    else if( mode.equalsIgnoreCase("train") ) {
      return new PathSourceToDestinationTrain();
    }
    else {
      throw new RuntimeException("Invalid resource type");
    }
  }
  
}
