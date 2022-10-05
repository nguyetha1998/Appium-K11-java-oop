package lab9;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static lab9.Animals.AnimalsBuilder;

public class AnimalRacing {
    private static final int MAX_SPEED = 60;

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Animals tiger = Animals.builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(MAX_SPEED)).setWithWings(false).build();
        Animals bird = Animals.builder().setName("Bird").setSpeed(new SecureRandom().nextInt(MAX_SPEED)).setWithWings(true).build();
        Animals lion = Animals.builder().setName("Tiger").setName("Lion").setSpeed(new SecureRandom().nextInt(MAX_SPEED)).setWithWings(false).build();
        Animals snake = Animals.builder().setName("Snake").setSpeed(new SecureRandom().nextInt(MAX_SPEED)).setWithWings(false).build();
        Animals bee = Animals.builder().setName("Bee").setSpeed(new SecureRandom().nextInt(MAX_SPEED)).setWithWings(true).build();

        List<Animals> animalList = Arrays.asList(tiger, bird, lion, snake, bee);
        for (Animals animals : animalList) {
            System.out.println(animals.toString());
        }

        System.out.println("The winner : " + animalRacing.printTheWinner(animalList));
    }

    public Animals printTheWinner(List<Animals> animalList) {
        Animals winner = animalList.get(0);
        for (Animals animals : animalList) {
            if (!animals.isWithWings()) {
                if (animals.getSpeed() > winner.getSpeed()) {
                    winner = animals;
                }
            }
        }
        return winner;
    }
}
