package Patterns.Factory.impl;

import java.util.List;
import java.util.Map;

import Patterns.Factory.Connection;
import Patterns.Factory.DataBaseFactory;
import Patterns.Factory.ResultSet;
import Patterns.Factory.Statement;

public class MySQLDataBaseFactory implements DataBaseFactory {

  @Override
  public Connection getConnection(String url, String password, String user) {
    return new MySQLConnection( url, password, user );
  }

  @Override
  public Statement createStatement(Connection connection) {
    return new MySQLSatement(connection);
  }

  @Override
  public ResultSet createResultSet(List<Map<String, Object>> data) {
    return new MySQLResultSet(data);
  }
  
}
