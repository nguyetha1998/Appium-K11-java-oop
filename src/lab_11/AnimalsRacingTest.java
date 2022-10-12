package lab_11;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsRacingTest {
    public static void main(String[] args) {
        AnimalController animalController= new AnimalController();

        Animals lion= new Lion("Lion",new SecureRandom().nextInt(50),false);
        Animals tiger= new Lion("Tiger",new SecureRandom().nextInt(50),false);
        Animals bird= new Bird("Bird",new SecureRandom().nextInt(50),true);
        Animals bee= new Bird("Bee",new SecureRandom().nextInt(50),true);

        List<Animals> animalsList= Arrays.asList(lion,bee,bird,tiger);

        System.out.println("Today's race will include the following animals: ");
        animalController.printAllAnimals(animalsList);
        animalController.printTheWinner(AnimalController.getListAnimalsRacing(animalsList));
    }
}
