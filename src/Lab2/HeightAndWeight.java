package Lab2;

import java.util.Scanner;

public class HeightAndWeight {
    public static void main(String[] args) {
         double BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter your height(m): ");
        double height= scanner.nextDouble();
        System.out.println("Pls enter your weight(kg): ");
        double weight=scanner.nextDouble();
        BMI=weight/(height*height);
        if (BMI <= 24.9){
            if (BMI<=18.5){
                System.out.println("You have under weight! Your BMI:"+ BMI+" You should increase kg:" + (20*height*height - weight) );
            }
            else System.out.println("You have normal weight! Your BMI:"+ BMI);
        } else  {
            if(BMI<29.9){
                System.out.println("You have over weight!Your BMI:"+ BMI+" You should decrease kg:" + (weight- 20*height*height));
            }
            else System.out.println("You have obesity weight!Your BMI:"+ BMI+" You should decrease kg:" + (weight- 20*height*height));
        }

    }
}
