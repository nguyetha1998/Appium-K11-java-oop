package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {

    public static void main(String[] args) {

        String str = "5hrs and 5 minutes";

        str = str.replaceAll("[^0-9]", "");
        str.trim();

        String[] item = str.split("");
        Integer totalMinutes = Integer.parseInt(item[0]) * 60 + Integer.parseInt(item[1]);
        System.out.println("Total minutes are: " + totalMinutes);


    }
}
