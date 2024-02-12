package springProj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springProj") // Specify the base package(s) to scan
public class AppConfig {

    @Bean
    public Circle circle() {
        return new Circle();
    }

}
