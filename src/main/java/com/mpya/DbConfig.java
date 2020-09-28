
package com.mpya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DbConfig {

    private static final Logger log = LoggerFactory.getLogger(DbConfig.class);

    @Bean
    CommandLineRunner initDatabase(UserRepo userRepo) {

        return args -> {

            log.info("...........Preloading.........");
            List<User> u = userRepo.findAll();
            u.forEach(user ->
                    System.out.println(
                            user.getFirstName() + "-" +
                                    user.getLastName()));

            userRepo.findByFirstName("Bob").forEach(System.out::println);

        };
    }

}
