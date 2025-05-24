package Patterns.DesignParkingLot.Strategy;

import java.util.List;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Model.ParkingLot;
import Patterns.DesignParkingLot.Model.ParkingSpot;
import Patterns.DesignParkingLot.Model.VehicleSpotType;
import Patterns.DesignParkingLot.Service.ParkingLotService;
import Patterns.DesignParkingLot.Service.ParkingSpotFactoryService;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{

  private ParkingLotService parkingLotService;
  private ParkingSpotFactoryService parkingSpotFactoryService;

  public RandomSpotAssignmentStrategy( ParkingLotService parkingLotService, ParkingSpotFactoryService factoryService) {
    this.parkingLotService = parkingLotService;
    this.parkingSpotFactoryService =factoryService;
  } 

  @Override
  public ParkingSpot assignParkingSpot(VehicleSpotType vehicleSpotType, Gate gate ) {
    // 
    ParkingLot parkingLot = parkingLotService.getParkingByGateID(gate);
    List<ParkingSpot> parkingSpots = parkingSpotFactoryService.getParkingSpot(parkingLot, vehicleSpotType);
    int randomIndex = (int)Math.floor(Math.random()*parkingSpots.size()-1);
    return parkingSpots.get(randomIndex);
  }
  
}
