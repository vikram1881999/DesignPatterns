package Patterns.DesignParkingLot.Controller;

import Patterns.DesignParkingLot.DTO.GenerateTicketRequestDTO;
import Patterns.DesignParkingLot.DTO.GenerateTicketResponseDTO;
import Patterns.DesignParkingLot.Model.ResponseStatus;
import Patterns.DesignParkingLot.Model.Ticket;
import Patterns.DesignParkingLot.Service.TicketService;

public class TicketController {

  private TicketService ticketService;
  
  public GenerateTicketResponseDTO generateTicket( GenerateTicketRequestDTO generateTicketRequestDTO ) {
    // First we can get the vehicle from database if vehicle is there else create the vehcile and store it.
    // 2 ways use Service or repository directly
    // Controllers should be as light as possible

    Ticket ticket = ticketService.generateTicket(generateTicketRequestDTO.getVehicleNumber(), generateTicketRequestDTO.getVehicleSpotType(), generateTicketRequestDTO.getGateID());
    if( ticket == null ) {
      return new GenerateTicketResponseDTO().setResponseStatus(ResponseStatus.FAILURE);
    }
    GenerateTicketResponseDTO dto = new GenerateTicketResponseDTO();
    dto.setTicket(ticket);
    dto.setResponseStatus(ResponseStatus.SUCCESS);
    return dto;
  }
  
}

/**
 * We are exposing the models directly to the client, Not a good approach 
 * 
 * problems with directly involving models in the Controller's API
 */