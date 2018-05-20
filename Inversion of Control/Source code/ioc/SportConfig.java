package ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
public class SportConfig {
    
    //Define a method to expose the bean
    @Bean
    public FortuneService sadFortuneService() {
        return new SadService();
    }
    
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

    
}
