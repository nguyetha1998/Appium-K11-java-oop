package lab_10_3;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();

        Animal tiger= new Tiger().setName("tiger").setSpeed(new SecureRandom().nextInt(60)).setWings(false);
        Animal lion= new Lion().setName("lion").setSpeed(new SecureRandom().nextInt(60)).setWings(false);
        Animal snake= new Snake().setName("snake").setSpeed(new SecureRandom().nextInt(60)).setWings(false);
        Animal bee= new Bee().setName("bee").setSpeed(new SecureRandom().nextInt(60)).setWings(true);
        List<Animal> animalList= Arrays.asList(tiger,lion,snake,bee);
        for (Animal animals : animalList) {
            System.out.println(animals.toString());
        }

        System.out.println("The winner : " + animalRacing.printTheWinner(animalList));
    }
    public Animal printTheWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animals : animalList) {
            if (!animals.isWings()) {
                if (animals.getSpeed() > winner.getSpeed()) {
                    winner = animals;
                }
            }
        }
        return winner;
    }
}
