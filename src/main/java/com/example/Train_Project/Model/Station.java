package com.example.Train_Project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stationCode;
    private String stationName;

    public Station(){

    }

    public Station(Long id, String stationCode, String stationName) {
        this.id = id;
        this.stationCode = stationCode;
        this.stationName = stationName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", stationCode='" + stationCode + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}
