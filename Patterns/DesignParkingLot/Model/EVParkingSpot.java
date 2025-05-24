package Patterns.DesignParkingLot.Model;

public class EVParkingSpot extends ParkingSpot {
  private Meter meter;

  public Meter getMeter() {
    return this.meter;
  }

  public void setMeter( Meter meter ){
    this.meter  = meter;
  }
}
