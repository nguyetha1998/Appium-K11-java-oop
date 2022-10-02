package Lab8;

import java.security.SecureRandom;

public class Lion extends Animals {

    public Lion() {
    }

    public Lion(String name){
        super.setSpeed(new SecureRandom().nextInt(50));
        super.setName(name);
    }
}
