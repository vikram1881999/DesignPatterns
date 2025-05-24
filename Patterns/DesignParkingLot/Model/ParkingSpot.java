package Patterns.DesignParkingLot.Model;

import java.util.List;

public class ParkingSpot extends BaseEntity {
  ParkingSpotStatus parkingSpotStatus;
  List<VehicleSpotType> supportedVehicleSpotTypes;
  int number;

  public ParkingSpotStatus getParkingSpotStatus() {
    return parkingSpotStatus;
  }

  public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
    this.parkingSpotStatus = parkingSpotStatus;
  }

  public List<VehicleSpotType> getSupportedVehicleSpotTypes() {
    return supportedVehicleSpotTypes;
  }

  public void setSupportedVehicleSpotTypes(List<VehicleSpotType> supportedVehicleSpotTypes) {
    this.supportedVehicleSpotTypes = supportedVehicleSpotTypes;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
