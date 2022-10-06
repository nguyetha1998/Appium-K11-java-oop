package lab_10_2;

import lab9.Animals;

import java.security.SecureRandom;
import java.util.List;

public class AnimalRacing {
    private String name;
    private int speed;
    private boolean withWings;
    private static final int MAX_SPEED = 60;

    public AnimalRacing(String name, int speed, boolean withWings) {
        this.name = name;
        this.speed = speed;
        this.withWings = withWings;
    }

    public void getListAnimal( Animal animal){
        System.out.print(animal.inputAllAnimal(name, new SecureRandom().nextInt(MAX_SPEED),withWings));
    }

}
