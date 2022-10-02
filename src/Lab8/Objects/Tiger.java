package Lab8.Objects;

import java.security.SecureRandom;

public class Tiger extends Animals{

    public Tiger() {
    }

    public Tiger(String name){
        super.setSpeed(new SecureRandom().nextInt(50));
        super.setName(name);
    }
}
