package com.vaadin.example.backend;

import com.vaadin.example.backend.domain.DailyForecast;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Service for retrieving simple forecast information
 */
public interface WeatherService {

    /**
     * Search method for retrieving a list of {@link DailyForecast DailyForecasts} based on the provided city name
     *
     * @param cityName city name to search for
     * @return list of forecasts
     */
    List<DailyForecast> getDailyForecast(String cityName);

    /**
     * Asynchrounous version of {@link #getDailyForecast(String)}
     *
     * @param cityname
     * @return a future that is completed with the result list
     */
    CompletableFuture<List<DailyForecast>> getDailyForecastAsync(String cityname);
}
