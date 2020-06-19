package dev.zubeirtech.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AutowiringApplication.class, args);

        Alien a = context.getBean(Alien.class);

        a.show();


    }

}
