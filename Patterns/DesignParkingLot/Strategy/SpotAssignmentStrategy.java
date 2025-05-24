package Patterns.DesignParkingLot.Strategy;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Model.ParkingSpot;
import Patterns.DesignParkingLot.Model.VehicleSpotType;

public interface SpotAssignmentStrategy {

  public ParkingSpot assignParkingSpot( VehicleSpotType vehicleSpotType, Gate gate );
  
}
