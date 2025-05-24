package Patterns.Strategy;

import java.util.List;

public class GooogleMaps {

  public List<String> pathFromSourceTODestination( String from, String to, String mode ) {
    return PathFactory.getPathToDestitionMode(mode).coordinates(from, to);
  }
  
}
