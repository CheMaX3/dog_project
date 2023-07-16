package org.chemax;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        DogTrainer dogTrainer = context.getBean("dogTrainer", DogTrainer.class);
        dogTrainer.trainDog();

        System.out.println(dogTrainer.getName());
        System.out.println(dogTrainer.getAge());

        context.close();
    }
}
