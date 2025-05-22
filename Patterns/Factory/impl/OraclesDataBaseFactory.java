package Patterns.Factory.impl;

import java.util.List;
import java.util.Map;

import Patterns.Factory.Connection;
import Patterns.Factory.DataBaseFactory;
import Patterns.Factory.ResultSet;
import Patterns.Factory.Statement;

public class OraclesDataBaseFactory implements DataBaseFactory {

  @Override
  public Connection getConnection(String url, String password, String user) {
    return new OracleConnection( url, password, user);
  }

  @Override
  public Statement createStatement(Connection connection) {
    return new OracleStatement(connection);
  }

  @Override
  public ResultSet createResultSet(List<Map<String, Object>> data) {
    return new OracleResultSet(data);
  }
  

}
