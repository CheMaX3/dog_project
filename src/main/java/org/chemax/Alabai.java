package org.chemax;

public class Alabai implements Dog {

    private Alabai() {
    }

    public void initAlabai() {
        System.out.println("Alabai initialization started");
    }

    public void destroyAlabai() {
        System.out.println("Alabai bean destroyed");
    }

    @Override
    public String getBark() {
        return "AV-AV";
    }

    @Override
    public String getBreed() {
        return "Alabai";
    }

    public static Alabai getAlabai() {
        return new Alabai();
    }
}
