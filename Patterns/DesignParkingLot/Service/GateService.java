package Patterns.DesignParkingLot.Service;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Repository.GateRepository;

public class GateService {

  private GateRepository gateRepository;

  public GateService( GateRepository gateRepository ) {
    this.gateRepository = gateRepository;
  }

  public Gate getGate( long id ) {
    return gateRepository.getGateFromRepostiory(id);
  }
}
