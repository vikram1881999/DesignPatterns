package Patterns.SingleTon;

import java.util.Map;

public class DataBaseConnectionSynchronised {

  private static DataBaseConnectionSynchronised instance = null;

  private DataBaseConnectionSynchronised() {
  }

  private DataBaseConnectionSynchronised( Map<String, String>  params ) {

  }

  public static  DataBaseConnectionSynchronised getInstance( Map<String, String> params ) {
    //Double Check locking
    if( instance == null ) {
      synchronized( DataBaseConnectionSynchronised.class)  {
        if( instance == null  ){
          instance = new DataBaseConnectionSynchronised(params);
        }
      }
    }
    return instance;
  }
  
}
