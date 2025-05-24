package Patterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class PathSourceToDestinationCar implements PathSourceToDestination{

  @Override
  public List<String> coordinates(String from, String to) {
    System.out.println("Path source to destination car");

    return new ArrayList<>();
  }


  
}
