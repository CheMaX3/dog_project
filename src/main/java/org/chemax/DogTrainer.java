package org.chemax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class DogTrainer {

    @Value("${dogTrainer.name}")
    private String name;

    @Value("${dogTrainer.age}")
    private int age;

    private Dog dog1;

    private Dog dog2;

    @Autowired
    public DogTrainer(@Qualifier("beanAlabai") Dog dog1,
                      @Qualifier("beanKorgi") Dog dog2) {
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    public void trainDog() {
        System.out.println(dog1.getBark());
        System.out.println(dog2.getBark());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}