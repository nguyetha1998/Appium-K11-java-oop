package lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public void printTheWinner(List<Animals> animalsList) {
        Animals winner = animalsList.get(0);
        for (Animals animals : animalsList) {
                if (animals.getSpeed() > winner.getSpeed()) {
                    winner = animals;
            }
        }
        System.out.println(" The winner is :" + winner);;
    }
    public static List<Animals> getListAnimalsRacing( List<Animals> animalsList){
        List<Animals> list= new ArrayList<>();
        if (!animalsList.isEmpty()){
            for (Animals animals : animalsList) {
                if (!animals.flyAble()){
                    list.add(animals);
                }
            }
        }
        else{
            System.out.println("Pls add animals in list!!");}
        return list;
    }
    public static List<Animals> getListAnimalsCheer( List<Animals> animalsList){
        List<Animals> list= new ArrayList<>();
        if (!animalsList.isEmpty()){
            for (Animals animals : animalsList) {
                if (animals.flyAble()){
                    list.add(animals);
                }
            }
        }
        else{
            System.out.println("Pls add animals in list!!");}
        return list;
    }
    public void printAllAnimals(List<Animals> animalsList){
        for (Animals animals : animalsList) {
            System.out.println(animals.toString());
        }
    }
}
