package Patterns.Factory.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Patterns.Factory.Connection;
import Patterns.Factory.ResultSet;
import Patterns.Factory.Statement;

public class MySQLSatement implements Statement{

  private Connection connection;

  public MySQLSatement( Connection connection ) {
    this.connection  = connection;
  }

  @Override
  public ResultSet executeQuery(String query) {
    System.out.println( "Executing on mysql " + query);
    List<Map<String, Object>> rows = new ArrayList<>();
    Map<String,Object> row = new HashMap<>(); 
    row.put("id", 1); 
    row.put("name", "Alice");
    rows.add(row);
    return new MySQLResultSet( rows );
  }
  @Override
  public void close() {
    System.out.println("Closing MySQL statement");
  }

}
