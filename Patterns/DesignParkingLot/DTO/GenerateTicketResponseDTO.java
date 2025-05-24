package Patterns.DesignParkingLot.DTO;

import Patterns.DesignParkingLot.Model.ResponseStatus;
import Patterns.DesignParkingLot.Model.Ticket;

public class GenerateTicketResponseDTO {

  private Ticket ticket;
  private ResponseStatus responseStatus;

  public GenerateTicketResponseDTO setTicket( Ticket ticket ) {
    this.ticket = ticket;
    return this;
  }

  public Ticket getTicketID() {
    return this.ticket;
  }

  public ResponseStatus getResponseStatus() {
    return this.responseStatus;
  }

  public GenerateTicketResponseDTO setResponseStatus( ResponseStatus responseStatus ) {
    this.responseStatus = responseStatus;
    return this;
  }
  
}
