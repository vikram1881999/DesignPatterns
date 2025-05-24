package Patterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class PathSourceToDestinationTrain implements PathSourceToDestination{

  @Override
  public List<String> coordinates(String from, String to) {
    System.out.println("Path source to destination train");
    return new ArrayList<>();
  }
  


}
