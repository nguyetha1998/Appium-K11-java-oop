package Lab8;

import java.security.SecureRandom;

public class Snake extends Animals{
    public Snake() {
    }

    public Snake(String name) {
        super.setName(name);
        super.setSpeed(new SecureRandom().nextInt(50));
    }
}
