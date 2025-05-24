package Patterns.DesignParkingLot.Model;

public class Operator  extends BaseEntity {

  private String name;

  public void setOperatorName( String name ) {
    this.name = name;
  }

  public String getName( ) {
    return this.name;
  }

}
