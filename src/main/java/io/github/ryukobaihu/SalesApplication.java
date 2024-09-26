package io.github.ryukobaihu;

import io.github.ryukobaihu.domain.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalesApplication {

    @Bean
    public CommandLineRunner init(@Autowired Client clients) {
        return args -> {
            Client client = new Client();
            clients.setName("Matheus");
            clients.save(client);
        };
    };

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }
}