package com.zeros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import({WebSocketConfig.class})
public class SpringWebsocketSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebsocketSampleApplication.class, args);
    }
}
