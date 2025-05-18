package Patterns.SingleTon;

// Works well in concurrency
public class EagerInittialisation {
  
  private static EagerInittialisation dbInstance = new EagerInittialisation();

  private EagerInittialisation() {

  }

  public static EagerInittialisation gEagerInittialisation( ) {
    return dbInstance;
  }

}
