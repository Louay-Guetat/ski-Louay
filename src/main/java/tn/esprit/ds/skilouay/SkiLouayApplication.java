package tn.esprit.ds.skilouay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SkiLouayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiLouayApplication.class, args);
    }

}
