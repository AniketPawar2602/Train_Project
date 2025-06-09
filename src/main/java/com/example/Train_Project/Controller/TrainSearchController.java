package com.example.Train_Project.Controller;

import com.example.Train_Project.Model.TrainSchedule;
import com.example.Train_Project.Service.TrainSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
@CrossOrigin
public class TrainSearchController {

    @Autowired
    private TrainSearchService trainSearchService;

    @GetMapping("/by-code")
    public List<TrainSchedule> findByCodeName(@RequestParam String sourceCode,
                                              @RequestParam String destinationCode){
        return trainSearchService.findByCodeName(sourceCode, destinationCode);
    }

    @GetMapping("/by-name")
    public List<TrainSchedule> findByName(@RequestParam String sourceName,
                                          @RequestParam String destinationName){
        return trainSearchService.findByName(sourceName,destinationName);
    }
}
