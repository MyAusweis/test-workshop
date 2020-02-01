package com.workshop.sb.testworkshop.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    @JsonProperty("latitude")   //konvert ke model JSON
    private double latitude;

    @JsonProperty("longitudinal")
    private double longitudinal;

    @JsonProperty("bus_driver_name")
    private String bus_driver_name;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("bus_number")
    private String bus_number;

    @JsonProperty("eta")
    private long eta;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitudinal() {
        return longitudinal;
    }

    public void setLongitudinal(double longitudinal) {
        this.longitudinal = longitudinal;
    }

    public String getBus_driver_name() {
        return bus_driver_name;
    }

    public void setBus_driver_name(String bus_driver_name) {
        this.bus_driver_name = bus_driver_name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBusnumber() {
        return bus_number;
    }

    public void setBus_number(String bus_number) {
        this.bus_number = bus_number;
    }

    public long getEta() {
        return eta;
    }

    public void setEta(long eta) {
        this.eta = eta;
    }
}
