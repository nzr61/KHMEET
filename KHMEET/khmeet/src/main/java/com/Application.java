package com;

import com.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
