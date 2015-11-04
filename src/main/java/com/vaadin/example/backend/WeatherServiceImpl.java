package com.vaadin.example.backend;

import com.vaadin.example.backend.domain.DailyForecast;
import com.vaadin.example.backend.domain.json.Forecast;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public List<DailyForecast> getDailyForecast(String cityName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromHttpUrl("http://api.openweathermap.org/data/2.5/forecast/daily")
                .queryParam("q", cityName)
                .queryParam("mode", "json")
                .queryParam("units", "metric")
                .queryParam("appid", "bd82977b86bf27fb59a04b61b657fb6f");

        Forecast forecast = restTemplate.getForObject(uriComponentsBuilder.build().encode().toUri(), Forecast.class);
        return forecast.getDays()
                .stream()
                .map((day) -> new DailyForecast(day.getDt(), day.getTemp().getDay(), day.getWeather().get(0).getDescription(), day.getSpeed(), day.getHumidity()))
                .collect(Collectors.toList());
    }

    @Override
    public CompletableFuture<List<DailyForecast>> getDailyForecastAsync(String cityname) {
        return CompletableFuture.supplyAsync(() -> getDailyForecast(cityname));
    }
}
