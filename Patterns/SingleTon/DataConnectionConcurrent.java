package Patterns.SingleTon;

import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DataConnectionConcurrent {

  private static final ReentrantLock lock = new ReentrantLock();
  private static DataConnectionConcurrent  instance = null;

  private DataConnectionConcurrent() {

  }

  public static DataConnectionConcurrent  getInstance( Map<String, String> params ) {
    if( instance == null ) {
      lock.lock();
      if( instance == null ) {
        instance =  new DataConnectionConcurrent();
      }

      lock.unlock();
    }
    return instance;
  }
}
