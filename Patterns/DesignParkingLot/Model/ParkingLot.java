package Patterns.DesignParkingLot.Model;

import java.util.List;

public class ParkingLot extends BaseEntity {
  private List<Floor> parkingFloors;
  private List<Gate> gates;
  private ParkingLotStatus parkingLotStatus;
  private String name;
  private String address;

  public List<Floor> getParkingFloors() {
    return parkingFloors;
  }

  public void setParkingFloors(List<Floor> parkingFloors) {
    this.parkingFloors = parkingFloors;
  }

  public List<Gate> getGates() {
    return gates;
  }

  public void setGates(List<Gate> gates) {
    this.gates = gates;
  }

  public ParkingLotStatus getParkingLotStatus() {
    return parkingLotStatus;
  }

  public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
    this.parkingLotStatus = parkingLotStatus;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
