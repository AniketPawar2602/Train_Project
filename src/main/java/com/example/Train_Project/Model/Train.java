package com.example.Train_Project.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;
    private String trainNumber;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<TrainSchedule> trainSchedules;

    public Train(){

    }

    public Train(Long id, String trainName, String trainNumber, List<TrainSchedule> trainSchedules) {
        this.id = id;
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.trainSchedules = trainSchedules;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public List<TrainSchedule> getTrainSchedules() {
        return trainSchedules;
    }

    public void setTrainSchedules(List<TrainSchedule> trainSchedules) {
        this.trainSchedules = trainSchedules;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", trainName='" + trainName + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", trainSchedules=" + trainSchedules +
                '}';
    }
}
