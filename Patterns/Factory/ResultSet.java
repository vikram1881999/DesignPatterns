package Patterns.Factory;

public interface ResultSet {

  boolean next();
  Object get( String columnLabel );
  void close();

}
