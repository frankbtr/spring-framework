package com.frank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.frank.proxy","com.frank.service","com.frank.repository"})
public class ProjectConfig {
}
