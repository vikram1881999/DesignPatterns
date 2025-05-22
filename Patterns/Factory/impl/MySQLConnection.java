package Patterns.Factory.impl;

import Patterns.Factory.Connection;
import Patterns.Factory.Statement;

public class MySQLConnection implements Connection {

  private String url;
  private String password;
  private String user;

  public MySQLConnection( String url, String password, String user ) {
    this.url = url;
    this.password = password;
    this.user = user;
  }

  @Override
  public void connect() {
    System.out.println("Connecting MYSql at " + url + password + user );
  }

  @Override
  public Statement createStatement() {
    return new MySQLSatement(this);
  }

  @Override
  public void close() {
    System.out.println("Closing MySQL statement");
  }

}
