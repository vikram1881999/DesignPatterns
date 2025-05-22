package Patterns.Factory;

import java.util.List;
import java.util.Map;

public interface DataBaseFactory {

  public Connection getConnection( String url, String password, String user);

  public Statement  createStatement( Connection connection );

  public ResultSet createResultSet( List<Map<String, Object>> data );
  
}
