package com.example.Usermanagementsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.Usermanagementsystem.repository")
public class JpaConfig {
}
