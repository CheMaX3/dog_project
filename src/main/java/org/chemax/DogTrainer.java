package org.chemax;

public class DogTrainer {

    private String name;

    private int age;

    private Dog dog;

    public DogTrainer() {
    }

    public DogTrainer(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void trainDog() {
        System.out.println(dog.getBark());
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}