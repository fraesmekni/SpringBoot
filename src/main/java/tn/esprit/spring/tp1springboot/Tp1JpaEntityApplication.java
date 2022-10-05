package tn.esprit.spring.tp1springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages={"tn.esprit.spring.entity"})
public class Tp1JpaEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp1JpaEntityApplication.class, args);
    }

}
