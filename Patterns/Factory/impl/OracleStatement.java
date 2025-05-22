package Patterns.Factory.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Patterns.Factory.Connection;
import Patterns.Factory.ResultSet;
import Patterns.Factory.Statement;

public class OracleStatement implements Statement{

  private Connection connection;

  public OracleStatement( Connection connection ) {
    this.connection = connection;
  }

  @Override
  public ResultSet executeQuery(String query) {
    System.out.println("Executing Oracle Query " + query );
    List<Map<String, Object>> resultSet = new ArrayList<>();
    Map<String, Object> row = new HashMap<>();
    row.put("id", "737");
    row.put("name", "Vikram ");
    resultSet.add(row);
    return new OracleResultSet(resultSet);
  }

  @Override
  public void close() {
    System.out.println("Closing OracleStatement");
  }
}
