package ticketAnalyzer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class TicketAnalyzer {

    public static void main(String[] args) throws IOException {
        File file = new File("ticketss.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(file);

        List<Ticket> tickets = new ArrayList<>();
        for (JsonNode node : rootNode.get("ticketss")) {
            tickets.add(new Ticket(
                    node.get("carrier").asText(),
                    node.get("departure_time").asText(),
                    node.get("arrival_time").asText(),
                    node.get("price").asInt()
            ));
        }

        // Найти минимальное время полета для каждого авиаперевозчика
        Map<String, Integer> minFlightTimes = new HashMap<>();
        for (Ticket ticket : tickets) {
            int flightTime = calculateFlightTime(ticket.departureTime, ticket.arrivalTime);
            minFlightTimes.merge(ticket.carrier, flightTime, Math::min);
        }

        // Рассчитать среднюю цену и медиану
        List<Integer> prices = tickets.stream().map(ticket -> ticket.price).sorted().collect(Collectors.toList());
        double avgPrice = prices.stream().mapToInt(Integer::intValue).average().orElse(0);
        int medianPrice = prices.get(prices.size() / 2);


        // Вывод результатов
        System.out.println("Минимальное время полета для каждого перевозчика:");
        minFlightTimes.forEach((carrier, time) -> System.out.println(carrier + ": " + time + " минут"));
        System.out.println("Разница между средней ценой и медианой: " + (avgPrice - medianPrice));
    }

    private static int calculateFlightTime(String departure, String arrival) {
        String[] depParts = departure.split(":");
        String[] arrParts = arrival.split(":");
        int depMinutes = Integer.parseInt(depParts[0]) * 60 + Integer.parseInt(depParts[1]);
        int arrMinutes = Integer.parseInt(arrParts[0]) * 60 + Integer.parseInt(arrParts[1]);
        return arrMinutes - depMinutes;
    }



}

