//package flightAnalysis.ticket;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.DoubleSummaryStatistics;
//import java.util.List;
//import java.util.Objects;
//
//    public class TicketCalculator {
//
//        public static void main(String[] args) {
//            if (args.length != 1) {
//                System.err.println("Usage: java TicketCalculator <path_to_tickets_json>");
//                System.exit(1);
//            }
//
//            File jsonFile = new File(args[0]);
//
//            try {
//                List<Ticket> tickets = readTicketsFromFile(jsonFile);
//                calculateStatistics(tickets);
//            } catch (IOException e) {
//                System.err.println("Error reading JSON file: " + e.getMessage());
//            }
//        }
//
//        private static List<Ticket> readTicketsFromFile(File jsonFile) throws IOException {
//            ObjectMapper objectMapper = new ObjectMapper();
//            return objectMapper.readValue(jsonFile, objectMapper.getTypeFactory().constructCollectionType(List.class, Ticket.class));
//        }
//
//        private static void calculateStatistics(List<Ticket> tickets) {
//            List<Ticket> vladivostokToTelAvivTickets = filterTicketsByCities(tickets, "Vladivostok", "Tel Aviv");
//
//            if (vladivostokToTelAvivTickets.isEmpty()) {
//                System.out.println("No flights found between Vladivostok and Tel Aviv.");
//                return;
//            }
//
//            Ticket minTimeTicket = Collections.min(vladivostokToTelAvivTickets, Comparator.comparingInt(Ticket::getFlightTime));
//            System.out.println("Minimum flight time between Vladivostok and Tel Aviv: " + minTimeTicket.flight_time + " minutes, carrier: " + minTimeTicket.carrier);
//
//            DoubleSummaryStatistics priceStatistics = vladivostokToTelAvivTickets.stream()
//                    .mapToDouble(Ticket::getPrice)
//                    .summaryStatistics();
//
//            double averagePrice = priceStatistics.getAverage();
//            double medianPrice = getMedian(vladivostokToTelAvivTickets, priceStatistics);
//
//            System.out.println("Difference between average and median price: " + (averagePrice - medianPrice));
//        }
//
//        private static List<Ticket> filterTicketsByCities(List<Ticket> tickets, String fromCity, String toCity) {
//            return tickets.stream()
//                    .filter(ticket -> Objects.equals(ticket.from, fromCity) && Objects.equals(ticket.to, toCity))
//                    .toList();
//        }
//
//
//    }
