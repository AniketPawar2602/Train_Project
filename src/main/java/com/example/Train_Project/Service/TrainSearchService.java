package com.example.Train_Project.Service;

import com.example.Train_Project.Model.TrainSchedule;
import com.example.Train_Project.Repository.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    @Autowired
    private TrainScheduleRepository trainScheduleRepository;

    public List<TrainSchedule> findByCodeName(String sourceCode, String destinationCode){
        return trainScheduleRepository.findBySource_StationCodeAndDestination_StationCode(sourceCode, destinationCode);
    }

    public List<TrainSchedule> findByName(String sourceName, String destinationName){
        return trainScheduleRepository.findBySource_StationNameAndDestination_StationName(sourceName, destinationName);
    }
}
