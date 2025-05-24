package Patterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class PathSourceToDestinationWalk implements PathSourceToDestination{

  @Override
  public List<String> coordinates(String from, String to) {
    System.out.println( " Path from source to destination ");
    return new ArrayList<>();
  }
  
}
