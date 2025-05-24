package Patterns.DesignParkingLot.Service;

import java.util.Date;

import Patterns.DesignParkingLot.Model.Gate;
import Patterns.DesignParkingLot.Model.Ticket;
import Patterns.DesignParkingLot.Model.Vehicle;
import Patterns.DesignParkingLot.Model.VehicleSpotType;

public class TicketService {

  private VehicleService vehicleService;
  private GateService gateService;

  public TicketService( VehicleService vehicleService, GateService gateService ) {
    this.vehicleService = vehicleService;
    this.gateService = gateService;
  }

  public Ticket generateTicket( String vehicleNumber, VehicleSpotType vehicleType, long gateID) {

    Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
    Gate gate = gateService.getGate(gateID);
    if( vehicle == null ) {
      vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
    }


    //Parking spot assignment


    Ticket ticket = new Ticket();
    ticket.setGate(gate);
    ticket.setVehicle(vehicle);
    ticket.setEntryTime(new Date());

    return null;
  }
  
}
