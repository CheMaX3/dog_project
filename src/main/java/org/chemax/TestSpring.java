package org.chemax;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DogTrainer dogTrainer = context.getBean("dogTrainerBean", DogTrainer.class);

        System.out.println(dogTrainer.getAge());
        System.out.println(dogTrainer.getName());
        dogTrainer.trainDog();

        context.close();
    }
}
