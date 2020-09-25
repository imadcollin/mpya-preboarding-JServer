package com.mpya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private static final Logger log = LoggerFactory.getLogger(DbConfig.class);

    @Bean
    CommandLineRunner initDatabase(UserRepo repository) {

return args -> {
    log.info("Preloading" + repository.save(new User( "Bob", null)));
    log.info("Preloading" + repository.save(new User( "Alice", null)));
    log.info("Preloading" + repository.save(new User( "Adam", null)));
};
    }
    }
