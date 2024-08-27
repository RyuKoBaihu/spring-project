package io.github.ryukobaihu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sales Systems";
    }

    @Bean(name = "OtherConfiguration")
    public String otherConfiguration(){
        return "Sales Systems Others";
    }
}