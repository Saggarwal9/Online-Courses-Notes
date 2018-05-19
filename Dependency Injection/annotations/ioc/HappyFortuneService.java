package ioc;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "You're going to have a good time.";
    }
    
}
