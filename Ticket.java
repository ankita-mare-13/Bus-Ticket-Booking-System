public class Ticket{
  String ticketID;
  Bus bus;
  String passengerName;
  int seatNo;
  public Ticket(String ticketID, Bus bus, String passengerName, int seatNo)
  {
    this.ticketID=ticketID;
    this.bus=bus;
    this.passengerName=passengerName;
    tis.seatNo=seatNo;
  }
  public void print(){
    System.out.println("\n--- TICKET BOOKED---");
    System.out.println("Ticket ID: "+ ticketID);
    System.out.println("passengerName: "+ passengerName);
    System.out.println("Bus: "+ bus.busName + "(" +bus.from + " to " + bus.to + ")");
    System.out.println("Seat No: " + seatNo + " | price: " + bus.price);
  }
}
    
    
    
    
