package com.api.learn.config;

import com.api.learn.entity.User;
import com.api.learn.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User succes = new User(
                    "succes",
                    "succes",
                    "succes.succes@succes.ok",
                    "SuperMagicien"
            );

            User geoffrey = new User(
                    "geoffrey",
                    "geoffrey",
                    "geoffrey.geoffrey@geoffrey.ok",
                    "SuperMagicien"
            );
            repository.saveAll(
                    List.of(succes,geoffrey)
            );
        };
    }
}
