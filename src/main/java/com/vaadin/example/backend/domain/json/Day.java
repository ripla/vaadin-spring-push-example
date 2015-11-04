
package com.vaadin.example.backend.domain.json;

import java.util.ArrayList;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "dt",
    "temp",
    "pressure",
    "humidity",
    "weather",
    "speed",
    "deg",
    "clouds",
    "rain"
})
public class Day {

    @JsonProperty("dt")
    private Long dt;
    @JsonProperty("temp")
    private Temp temp;
    @JsonProperty("pressure")
    private Double pressure;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("weather")
    private java.util.List<Weather> weather = new ArrayList<Weather>();
    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Integer deg;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("rain")
    private Double rain;

    /**
     *
     * @return
     *     The dt
     */
    @JsonProperty("dt")
    public Long getDt() {
        return dt;
    }

    /**
     *
     * @param dt
     *     The dt
     */
    @JsonProperty("dt")
    public void setDt(Long dt) {
        this.dt = dt;
    }

    /**
     *
     * @return
     *     The temp
     */
    @JsonProperty("temp")
    public Temp getTemp() {
        return temp;
    }

    /**
     *
     * @param temp
     *     The temp
     */
    @JsonProperty("temp")
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    /**
     *
     * @return
     *     The pressure
     */
    @JsonProperty("pressure")
    public Double getPressure() {
        return pressure;
    }

    /**
     *
     * @param pressure
     *     The pressure
     */
    @JsonProperty("pressure")
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    /**
     *
     * @return
     *     The humidity
     */
    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    /**
     *
     * @param humidity
     *     The humidity
     */
    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     *
     * @return
     *     The weather
     */
    @JsonProperty("weather")
    public java.util.List<Weather> getWeather() {
        return weather;
    }

    /**
     *
     * @param weather
     *     The weather
     */
    @JsonProperty("weather")
    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    /**
     *
     * @return
     *     The speed
     */
    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     *     The speed
     */
    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     *     The deg
     */
    @JsonProperty("deg")
    public Integer getDeg() {
        return deg;
    }

    /**
     *
     * @param deg
     *     The deg
     */
    @JsonProperty("deg")
    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    /**
     *
     * @return
     *     The clouds
     */
    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    /**
     *
     * @param clouds
     *     The clouds
     */
    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    /**
     *
     * @return
     *     The rain
     */
    @JsonProperty("rain")
    public Double getRain() {
        return rain;
    }

    /**
     *
     * @param rain
     *     The rain
     */
    @JsonProperty("rain")
    public void setRain(Double rain) {
        this.rain = rain;
    }
}
