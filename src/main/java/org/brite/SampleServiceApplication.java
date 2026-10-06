package org.brite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.brite.sample"})
public class SampleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceApplication.class, args);
    }

}
