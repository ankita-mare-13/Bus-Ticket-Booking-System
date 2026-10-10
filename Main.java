import java.util.*;
public class Main {
    static List<Bus> buses = new ArrayList<>();
    static Map<String, Ticket> tickets = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        buses.add(new Bus(101, "Shivneri", "Pune", "Mumbai", 40, 500));
        buses.add(new Bus(102, "Shivshahi", "Pune", "Nashik", 40, 400));
        buses.add(new Bus(103, "Hirkani", "Mumbai", "Pune", 30, 500));

        while(true) {
            System.out.println("\n1.Show Buses 2.Book Ticket 3.View Ticket 4.Cancel 5.Exit");
            int ch = sc.nextInt();
            if(ch==1) buses.forEach(Bus::display);
            else if(ch==2) book();
            else if(ch==3) view();
            else if(ch==4) cancel();
            else break;
        }
    }
    static void book() {
        System.out.print("Enter Bus No: "); int bno = sc.nextInt();
        Bus b = buses.stream().filter(x->x.busNo==bno).findFirst().orElse(null);
        if(b==null || b.availableSeats==0) { System.out.println("Bus not available"); return; }
        System.out.print("Passenger Name: "); String name = sc.next();
        String tid = "T" + System.currentTimeMillis();
        Ticket t = new Ticket(tid, b, name, b.totalSeats - b.availableSeats + 1);
        b.availableSeats--; tickets.put(tid, t); t.print();
    }
    static void view() {
        System.out.print("Ticket ID: "); String id = sc.next();
        if(tickets.containsKey(id)) tickets.get(id).print(); else System.out.println("Not Found");
    }
    static void cancel() {
        System.out.print("Ticket ID: "); String id = sc.next();
        if(tickets.containsKey(id)) {
            tickets.get(id).bus.availableSeats++;
            tickets.remove(id);
            System.out.println("Cancelled Successfully");
        } else System.out.println("Not Found");
    }
}
