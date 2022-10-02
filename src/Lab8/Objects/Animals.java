package Lab8.Objects;

import java.security.SecureRandom;

public class Animals {
    private String name;
    private int speed;

    public Animals() {
    }

    public Animals(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
