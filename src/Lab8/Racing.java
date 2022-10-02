package Lab8;

import Lab8.Objects.Lion;
import Lab8.Objects.Snake;
import Lab8.Objects.Tiger;

public class Racing {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion");
        Tiger tiger = new Tiger("Tiger");
        Snake sanke = new Snake("Snake");
        int maxOfNums = Math.max(lion.getSpeed(), tiger.getSpeed());

        if(lion.getSpeed() == maxOfNums){
            System.out.println("Winner is "+lion.getName()+", with speed: "+maxOfNums);
        }else if (tiger.getSpeed() == maxOfNums){
            System.out.println("Winner is "+tiger.getName()+", with speed: "+maxOfNums);
        }else {
            System.out.println("Winner is "+sanke.getName()+", with speed: "+maxOfNums);
        }
    }
}
