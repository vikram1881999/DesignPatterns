package Patterns.DesignParkingLot.Service;

import Patterns.DesignParkingLot.Model.Vehicle;
import Patterns.DesignParkingLot.Model.VehicleSpotType;
import Patterns.DesignParkingLot.Repository.VehicleRepository;

public class VehicleService {
  
  private VehicleRepository vehicleRepository;
  public VehicleService( VehicleRepository vehicleRepository) {
    this.vehicleRepository = vehicleRepository;
  }

  public Vehicle getVehicle( String vehicleNumber)  {
    return vehicleRepository.getVehicleFromVehicleRepsoritory(vehicleNumber);
  }

  public Vehicle registerVehicle( String vehicleNumber, VehicleSpotType spotType ) {
    return null;
  }
}
