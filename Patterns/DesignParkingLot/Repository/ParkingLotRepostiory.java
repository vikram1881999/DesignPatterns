package Patterns.DesignParkingLot.Repository;
import java.util.HashMap;
import java.util.Map;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Model.ParkingLot;

public class ParkingLotRepostiory {


  private Map<Long, ParkingLot> parkingLot = new HashMap<>();
  
  public ParkingLot getParkingLotByGate( Gate gate ) {

    for( ParkingLot parking: parkingLot.values()) {
      for( Gate currgate: parking.getGates() ) {
        if( currgate.getID() == gate.getID() ) {
          return parking;
        }
      }
    }

    throw new RuntimeException("We dont have the gate you looking for");
  }
}
