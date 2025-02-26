package javadas.flightAnalysis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateJsonFile {
    public static void main(String[] args) {
        // Создание списка полетов
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Aeroflot", "Владивосток", "Тель-Авив", 8, 500));
        flights.add(new Flight("British Airways", "Владивосток", "Тель-Авив", 9, 600));
        flights.add(new Flight("Lufthansa", "Владивосток", "Тель-Авив", 7, 550));

        // Создание объекта, содержащего список полетов
        FlightsData data = new FlightsData(flights);

        // Преобразование объекта в JSON и запись в файл
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //String phat = "C:\\Users\\User\\Desktop\\tickets.json";
        try (FileWriter writer = new FileWriter((File) flights)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();



        }
        System.out.println(gson.toJson(gson));
    }


    // Класс, представляющий один полет
    static class Flight {
        String carrier;
        String departureCity;
        String arrivalCity;
        int flightTime;
        int price;

        public Flight(String carrier, String departureCity, String arrivalCity, int flightTime, int price) {
            this.carrier = carrier;
            this.departureCity = departureCity;
            this.arrivalCity = arrivalCity;
            this.flightTime = flightTime;
            this.price = price;
        }
    }

    // Класс, представляющий данные о полетах
    static class FlightsData {
        List<Flight> flights;

        public FlightsData(List<Flight> flights) {
            this.flights = flights;
        }
    }
}
