package Lab8;

import Lab8.Objects.Lion;
import Lab8.Objects.Snake;
import Lab8.Objects.Tiger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Racing {
    public static void race(Lion lion,Tiger tiger, Snake snake){
        System.out.println(lion.getName() + ", speed is :"+lion.getSpeed());
        System.out.println(tiger.getName() + ", speed is :"+tiger.getSpeed());
        System.out.println(snake.getName() + ", speed is :"+snake.getSpeed());
        int maxOfNums = Collections.max(Arrays.asList(lion.getSpeed(), tiger.getSpeed(), snake.getSpeed()));
        if(lion.getSpeed() == maxOfNums){
            System.out.println("Winner is "+lion.getName()+", with speed: "+maxOfNums);
        }else if (tiger.getSpeed() == maxOfNums){
            System.out.println("Winner is "+tiger.getName()+", with speed: "+maxOfNums);
        }else {
            System.out.println("Winner is "+snake.getName()+", with speed: "+maxOfNums);
        }
    }
    public static void main(String[] args) {
        Lion lion = new Lion("Lion");
        Tiger tiger = new Tiger("Tiger");
        Snake snake = new Snake("Snake");
        race(lion,tiger,snake);

    }
}
