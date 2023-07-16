package org.chemax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class DogTrainingSchool {

    private String name;
    private DogTrainer dogTrainer;

    @Autowired
    public DogTrainingSchool(DogTrainer dogTrainer) {
        this.name = "FirstSchool";
        this.dogTrainer = dogTrainer;
    }
}
