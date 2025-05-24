package Patterns.DesignParkingLot.Service;

import java.util.List;

import Patterns.DesignParkingLot.Model.ParkingLot;
import Patterns.DesignParkingLot.Model.ParkingSpot;

public interface ParkingSpotService {
  public List<ParkingSpot> getParkingSpotByParkingLot( ParkingLot parkingLot );
} 
