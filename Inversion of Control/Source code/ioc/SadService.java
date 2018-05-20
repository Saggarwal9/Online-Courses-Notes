package ioc;

import org.springframework.stereotype.Component;

@Component
public class SadService implements FortuneService {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Rekt lol";
    }

}
