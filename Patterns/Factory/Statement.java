package Patterns.Factory;

public interface Statement {

  ResultSet executeQuery( String query );
  void close();
  
}
