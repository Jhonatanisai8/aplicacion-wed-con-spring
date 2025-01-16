package com.jhonatan.spring.boot.wed.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(
        {
            @PropertySource("classpath:textos.properties")
        }
)
public class TextoPropertiesConfig {

}
