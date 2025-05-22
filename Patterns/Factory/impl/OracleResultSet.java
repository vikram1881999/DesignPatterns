package Patterns.Factory.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Patterns.Factory.ResultSet;

public class OracleResultSet implements ResultSet{

  private List<Map<String, Object>> resultSet;;
  private Iterator<Map<String, Object>> iter;
  private Map<String, Object> current;

  public OracleResultSet( List<Map<String, Object>> resultSet ) {
    this.resultSet = resultSet;
    this.iter = resultSet.iterator();
  }

  @Override
  public boolean next() {
    if( iter.hasNext() ) {
      current = iter.next();
      return true;
    }
    return false;
  }

  @Override
  public Object get(String columnLabel) {
    return current.get(columnLabel);
  }

  @Override
  public void close() {
    System.out.println("Closing the Oracle Connection");
  }
  
}
