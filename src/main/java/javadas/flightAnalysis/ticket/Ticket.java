//package flightAnalysis.ticket;
//
//import java.util.Objects;
//
//public class Ticket {
//
//    public String from;
//    public String to;
//    public String carrier;
//    public int flight_time;
//
//    public Ticket() {
//    }
//
//    public double price;
//
//    public Ticket(String from, String to, String carrier, int flight_time, double price) {
//        this.from = from;
//        this.to = to;
//        this.carrier = carrier;
//        this.flight_time = flight_time;
//        this.price = price;
//    }
//
//    public String getFrom() {
//        return from;
//    }
//
//    public void setFrom(String from) {
//        this.from = from;
//    }
//
//    public String getTo() {
//        return to;
//    }
//
//    public void setTo(String to) {
//        this.to = to;
//    }
//
//    public String getCarrier() {
//        return carrier;
//    }
//
//    public void setCarrier(String carrier) {
//        this.carrier = carrier;
//    }
//
//    public int getFlight_time() {
//        return flight_time;
//    }
//
//    public void setFlight_time(int flight_time) {
//        this.flight_time = flight_time;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Ticket ticket = (Ticket) o;
//        return flight_time == ticket.flight_time && Double.compare(ticket.price, price) == 0 && Objects.equals(from, ticket.from) && Objects.equals(to, ticket.to) && Objects.equals(carrier, ticket.carrier);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(from, to, carrier, flight_time, price);
//    }
//
//    @Override
//    public String toString() {
//        return "Ticket{" +
//                "from='" + from + '\'' +
//                ", to='" + to + '\'' +
//                ", carrier='" + carrier + '\'' +
//                ", flight_time=" + flight_time +
//                ", price=" + price +
//                '}';
//    }
//
//    public static <T> Object getFlightTime(T t) {
//        return null;
//    }
//}
