package org.chemax;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dogTrainer.properties")
public class SpringConfig {

    @Bean
    public Alabai beanAlabai() {
        return new Alabai();
    }

    @Bean
    public Korgi beanKorgi() {
        return new Korgi();
    }

    @Bean
    public DogTrainer dogTrainer() {
        return new DogTrainer(beanAlabai(), beanKorgi());
    }
}
