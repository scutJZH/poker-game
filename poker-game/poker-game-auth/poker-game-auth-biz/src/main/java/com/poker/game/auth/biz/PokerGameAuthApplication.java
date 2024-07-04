package com.poker.game.auth.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaRepositories("com.poker.game.auth.biz.repository")
public class PokerGameAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(PokerGameAuthApplication.class, args);
    }
}
