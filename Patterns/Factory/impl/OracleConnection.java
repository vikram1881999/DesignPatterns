package Patterns.Factory.impl;

import Patterns.Factory.Connection;
import Patterns.Factory.Statement;

public class OracleConnection implements Connection {

  private String url;
  private String user;
  private String password;

  public OracleConnection( String url, String password, String user ) {
    this.url = url;
    this.user = user;
    this.password = password;
  }

  @Override
  public void connect() {
    System.out.println( "Established connection to OracleDB =" + url + "_" + user + "_" + password);
  }

  @Override
  public Statement createStatement() {
    return new OracleStatement( this );
  }

  @Override
  public void close() {
    System.out.println("Closing the oracle DB connection ");
  }
  
}
