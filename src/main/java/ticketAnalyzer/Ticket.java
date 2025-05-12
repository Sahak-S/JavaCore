package ticketAnalyzer;

public class Ticket {

    String carrier;
    String departureTime;
    String arrivalTime;
    int price;

    Ticket(String carrier, String departureTime, String arrivalTime, int price) {
        this.carrier = carrier;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

}
