package com.vaadin.example.ui;

import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.example.backend.WeatherService;
import com.vaadin.example.backend.domain.DailyForecast;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

@UIScope
@SpringComponent
public class WeatherDisplay extends VerticalLayout {

    private static final Logger logger = LoggerFactory.getLogger(WeatherDisplay.class);

    @Autowired
    private WeatherService weatherService;

    private BeanItemContainer<DailyForecast> forecasts = new BeanItemContainer<>(DailyForecast.class);

    private Grid forecastGrid = new Grid();

    private TextField cityNameField = new TextField();

    private ProgressBar loadingIndicator = new ProgressBar();

    public WeatherDisplay() {
        setSpacing(true);

        loadingIndicator.setIndeterminate(true);
        loadingIndicator.setVisible(false);

        HorizontalLayout input = new HorizontalLayout();
        input.setSpacing(true);
        input.addComponents(cityNameField, loadingIndicator);

        cityNameField.addValueChangeListener(this::cityChanged);
        cityNameField.setInputPrompt("City");

        forecastGrid.setContainerDataSource(forecasts);
        forecastGrid.setWidth("100%");
        forecastGrid.setColumnOrder("date","description","temperature","humidity","windSpeed");

        addComponents(input, forecastGrid);

        setComponentAlignment(input, Alignment.TOP_CENTER);
        setComponentAlignment(forecastGrid, Alignment.MIDDLE_CENTER);
    }


    private void cityChanged(Property.ValueChangeEvent valueChangeEvent) {

        loadingIndicator.setVisible(true);

        String cityName = cityNameField.getValue();

        weatherService.getDailyForecastAsync(cityName).exceptionally(ex -> {
            logger.error("Error while searching for " + cityName, ex);
            Notification.show("Error while searching for " + cityName, Notification.Type.ERROR_MESSAGE);
            return Collections.emptyList();
        }).thenAccept(dailyForecast -> {
            getUI().access(() -> {
                forecasts.removeAllItems();
                forecasts.addAll(dailyForecast);
                loadingIndicator.setVisible(false);
            });
        });
    }
}
