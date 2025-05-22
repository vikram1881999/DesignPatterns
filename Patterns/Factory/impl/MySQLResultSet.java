package Patterns.Factory.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Patterns.Factory.ResultSet;

public class MySQLResultSet implements ResultSet{

  private Iterator<Map<String,Object>> iter;
    private Map<String,Object> current;

  public MySQLResultSet( List<Map<String, Object>> resultSet ) {
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
    System.out.println("Closing MySQL result set");
  }

}
