package Patterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

  private Map<BatachUniversity, Student> registry = new HashMap<>();

  public StudentRegistry() {
    this.registry = new HashMap<>();
  }

  public void register( BatachUniversity key, Student student ) {
    registry.put(key, student);
  }

  public Student getProtoype( BatachUniversity key )  {
    if( registry.containsKey(key) ) {
      return registry.get(key);
    }
    throw new Error("The object doesnt exists");
  }
  
}
