package Lab6;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String myPassword = "password123";

        for ( int i=0; i <3 ; i++) {
            System.out.println("Pls enter your Passwords: ");
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            if (myPassword.equals(password)) {
                System.out.println("That right!");
                break;
            }
            if(i==2){
                System.out.println("You have entered more than 3 times");
            }
        }

    }
}
