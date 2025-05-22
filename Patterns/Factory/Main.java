package Patterns.Factory;


public class Main {
  
  public static void main( String[] args  ){
    String dbType = "oracle";
    String url = "jdbc:dummy://localhost:3306/mydb";
    String user = "root";
    String pass = "password";
    
    DataBaseFactory db = FactoryProducer.getFactory(dbType);
    Connection conn = db.getConnection(url, pass, user);
    conn.connect();
    Statement statement = db.createStatement(conn);
    ResultSet resultSet = statement.executeQuery("SELECT id, name from USERS");

    while (resultSet.next()) {
      System.out.println(resultSet.get("id") + ": " + resultSet.get("name"));
    }

    resultSet.close();
    statement.close();
    conn.close();
  }
}
