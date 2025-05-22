package Patterns.Factory;

import Patterns.Factory.impl.MySQLDataBaseFactory;
import Patterns.Factory.impl.OraclesDataBaseFactory;

public class FactoryProducer {
  public static DataBaseFactory getFactory(String dbType) {
      if ("mysql".equalsIgnoreCase(dbType)) {
          return new MySQLDataBaseFactory();
      } else if ("oracle".equalsIgnoreCase(dbType)) {
          return new OraclesDataBaseFactory();
      }
      throw new IllegalArgumentException("Unknown database type: " + dbType);
  }
}