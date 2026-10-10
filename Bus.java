public class Bus{
  int busNo;
  String busName;
  String from;
  String to;
  int totalSeats;
  int availableSeats;
  double price;
  public Bus(int busNo, String busName, String from, String to, int totalSeats, int availableSeats, double price)
  {
    this.busNo=busNo;
    this.busName=busName;
    this.from=from;
    this.to=to;
    this.totlSeats=totalSeats;
    this.availableSeats=availableSeats;
    this.price=price;
  }
  public void display()
  {
    System.out.println(busNo + " | " + busName + " | " + from + " -> " + to + " | Seats: " + availableSeats + "/" + totalSeats + " | Rs. " + price);
  }
}
