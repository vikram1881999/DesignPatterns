package Patterns.DesignParkingLot.Model;

public class Vehicle extends BaseEntity {
  private VehicleSpotType vehicleSpotType;
  private String number;

  public VehicleSpotType getVehicleSpotType() {
      return vehicleSpotType;
  }

  public void setVehicleSpotType(VehicleSpotType vehicleSpotType) {
      this.vehicleSpotType = vehicleSpotType;
  }

  public String getNumber() {
      return number;
  }

  public void setNumber(String number) {
      this.number = number;
  }

}
