package org.chemax;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Korgi implements Dog {

    public Korgi() {
    }

    @Override
    public String getBark() {
        return "тяф-тяф";
    }

    @PostConstruct
    @Override
    public void init() {
        System.out.println("Korgi bean initialized");
    }

    @PreDestroy
    @Override
    public void destroy() {
        System.out.println("Korgi bean destroyed");
    }
}
