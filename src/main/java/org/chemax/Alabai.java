package org.chemax;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Alabai implements Dog {

    private Alabai() {
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
