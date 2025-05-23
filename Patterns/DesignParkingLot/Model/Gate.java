package Patterns.DesignParkingLot.Model;

public class Gate extends BaseEntity{
  private GateType gateType;
  private Operator operator;
  private Floor floor;
  private ParkingLot parkingLot;

  public void setOperator( Operator operator ) {
    this.operator = operator;
  }

  public Operator getOperator() {
    return this.operator;
  }

  public void setGateType( GateType gateType )  {
    this.gateType = gateType;
  }

  public GateType getGateType() {
    return this.gateType;
  }

  public void setFloor( Floor floor ) {
    this.floor = floor;
  }

  public Floor getFloor() {
    return this.floor;
  }

  public void setParkingLot( ParkingLot parkingLot ) {
    this.parkingLot = parkingLot;
  }

  public ParkingLot getParkingLot() {
    return this.parkingLot;
  }
}
