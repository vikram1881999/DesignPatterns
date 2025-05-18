package Patterns.SingleTon;

import java.util.Map;

// Not thread safe
public class DataBaseConnection {
  private static DataBaseConnection instance = null;

  private DataBaseConnection() {

  }

  private DataBaseConnection(Map<String, String> params ) {
    //INITIALIZE data base with custom params;
  }
  
  public static DataBaseConnection getInstance( Map<String, String> params ) {
    if( instance == null ) {
      instance = new DataBaseConnection( params );
    }
    return instance;
  }
}
