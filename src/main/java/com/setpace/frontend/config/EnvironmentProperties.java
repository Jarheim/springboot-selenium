package com.setpace.frontend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
@Getter @Setter
public class EnvironmentProperties {
    private String url;
}