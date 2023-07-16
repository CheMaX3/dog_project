package org.chemax;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DogTrainer dogTrainer = context.getBean("dogTrainer", DogTrainer.class);
        dogTrainer.trainDog();

        System.out.println(dogTrainer.getName());
        System.out.println(dogTrainer.getAge());

        context.close();
    }
}
