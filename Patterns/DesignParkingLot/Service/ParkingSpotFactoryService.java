package Patterns.DesignParkingLot.Service;

import java.util.List;

import Patterns.DesignParkingLot.Model.ParkingLot;
import Patterns.DesignParkingLot.Model.ParkingSpot;
import Patterns.DesignParkingLot.Model.VehicleSpotType;

public class ParkingSpotFactoryService {

  public List<ParkingSpot> getParkingSpot( ParkingLot parkingLot, VehicleSpotType spotType ) {
    ParkingSpotService parkingSpotService;
    if( spotType == VehicleSpotType.SMALL ) {
      parkingSpotService = new ParkingSpotSmallVehicleService();
    }
    else if( spotType == VehicleSpotType.LARGE) {
      parkingSpotService = new ParkingSpotLargeVehicelService();
    }
    else {
      parkingSpotService = new ParkingSpotMediumVehicleService();
    }

    return parkingSpotService.getParkingSpotByParkingLot(parkingLot);
  }
  
}
