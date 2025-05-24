package Patterns.DesignParkingLot.Service;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Model.ParkingLot;
import Patterns.DesignParkingLot.Repository.ParkingLotRepostiory;

public class ParkingLotService {
  
  private ParkingLotRepostiory parkingLotRepostiory;

  public ParkingLotService( ParkingLotRepostiory parkingLotRepostiory ) {
    this.parkingLotRepostiory = parkingLotRepostiory;
  }

  public ParkingLot getParkingByGateID( Gate gate ) {
    return parkingLotRepostiory.getParkingLotByGate(gate);
  }
}
