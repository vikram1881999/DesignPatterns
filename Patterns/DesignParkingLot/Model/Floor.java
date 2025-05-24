package Patterns.DesignParkingLot.Model;

import java.util.List;

public class Floor extends BaseEntity {
  private List<ParkingSpot> parkingSpots;
  private int number;
  private ParkingFloorStatus parkingFloorStatus;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public List<ParkingSpot> getParkingSpots() {
    return parkingSpots;
  }

  public void setParkingSpots(List<ParkingSpot> parkingSpots) {
    this.parkingSpots = parkingSpots;
  }

  public ParkingFloorStatus getParkingFloorStatus() {
    return parkingFloorStatus;
  }

  public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
    this.parkingFloorStatus = parkingFloorStatus;
  }

}
