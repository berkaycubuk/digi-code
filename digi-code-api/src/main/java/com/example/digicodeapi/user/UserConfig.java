package com.example.digicodeapi.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User joe = new User(
                    "Joe",
                    "Biden",
                    "joe@biden.com",
                    "password",
                    Role.USER
            );

            User maria = new User(
                    "Maria",
                    "Koe",
                    "maria@biden.com",
                    "password",
                    Role.USER
            );

            repository.saveAll(
                    List.of(joe, maria)
            );
        };
    }
}
