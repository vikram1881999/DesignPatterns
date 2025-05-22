package Patterns.Factory;

public interface Connection {
  public void connect();
  Statement createStatement();
  public void close();
}
