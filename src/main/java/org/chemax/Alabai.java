package org.chemax;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Alabai implements Dog {

    public Alabai() {
    }

    @PostConstruct
    @Override
    public void init() {
        System.out.println("Alabai bean initialized");
    }

    @PreDestroy
    @Override
    public void destroy() {
        System.out.println("Alabai bean destroyed");
    }

    @Override
    public String getBark() {
        return "AV-AV";
    }
}
