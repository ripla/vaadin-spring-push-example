
package com.vaadin.example.backend.domain.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "day",
    "min",
    "max",
    "night",
    "eve",
    "morn"
})
public class Temp {

    @JsonProperty("day")
    private Double day;
    @JsonProperty("min")
    private Double min;
    @JsonProperty("max")
    private Double max;
    @JsonProperty("night")
    private Double night;
    @JsonProperty("eve")
    private Double eve;
    @JsonProperty("morn")
    private Double morn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The day
     */
    @JsonProperty("day")
    public Double getDay() {
        return day;
    }

    /**
     *
     * @param day
     *     The day
     */
    @JsonProperty("day")
    public void setDay(Double day) {
        this.day = day;
    }

    /**
     *
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Double getMin() {
        return min;
    }

    /**
     *
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     *
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Double getMax() {
        return max;
    }

    /**
     *
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     *
     * @return
     *     The night
     */
    @JsonProperty("night")
    public Double getNight() {
        return night;
    }

    /**
     *
     * @param night
     *     The night
     */
    @JsonProperty("night")
    public void setNight(Double night) {
        this.night = night;
    }

    /**
     *
     * @return
     *     The eve
     */
    @JsonProperty("eve")
    public Double getEve() {
        return eve;
    }

    /**
     *
     * @param eve
     *     The eve
     */
    @JsonProperty("eve")
    public void setEve(Double eve) {
        this.eve = eve;
    }

    /**
     *
     * @return
     *     The morn
     */
    @JsonProperty("morn")
    public Double getMorn() {
        return morn;
    }

    /**
     *
     * @param morn
     *     The morn
     */
    @JsonProperty("morn")
    public void setMorn(Double morn) {
        this.morn = morn;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
