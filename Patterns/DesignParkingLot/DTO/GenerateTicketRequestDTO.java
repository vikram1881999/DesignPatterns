package Patterns.DesignParkingLot.DTO;

import Patterns.DesignParkingLot.Model.VehicleSpotType;

public class GenerateTicketRequestDTO {

  private long gateID;
  private String vehicleNumber;
  private VehicleSpotType vehicleSpotType;

  public void setGateID( long gateID ) {
    this.gateID = gateID;
  }

  public void setVehicleNumber( String vehicleNumber ) {
    this.vehicleNumber =vehicleNumber;
  }

  public void setSpotType(  VehicleSpotType  spotType  ) {
    this.vehicleSpotType = spotType;
  }

  public VehicleSpotType getVehicleSpotType() {
    return this.vehicleSpotType;
  }

  public long getGateID() {
    return this.gateID;
  }

  public String getVehicleNumber() {
    return this.vehicleNumber;
  }
  
}
