package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {
    public static void printMenu() {
        System.out.println("1. Add number to array list");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Exit!");
        System.out.println("Please choose menu: ");
    }

    public static int getNumberFromKeyboards() {
        System.out.println("Pls enter your number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getMaxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int getMinNumber(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static boolean checkEmptyList(List<Integer> list) {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static int searchNumber(List<Integer> list) {
        int result = -1;
        int number = getNumberFromKeyboards();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                result = i;
                break;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
//        listNumber.add(2);
//        listNumber.add(4);
//        listNumber.add(2);
//        listNumber.add(11);
//        listNumber.add(9);
//        listNumber.add(6);
        boolean out = true;
        while (out) {
            System.out.println("\n ---------------Menu-------------");
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    int number = getNumberFromKeyboards();
                    listNumber.add(number);
                    System.out.println("Your array include :" + listNumber.toString());
                    break;
                case 2:
                    int number2 = getNumberFromKeyboards();
                    System.out.println("Your number input is: " + number2);
                    break;
                case 3:
                    if (checkEmptyList(listNumber)) {
                        System.out.println("Max number in array is: " + getMaxNumber(listNumber));
                    } else System.out.println("The array is null");
                    break;
                case 4:
                    if (checkEmptyList(listNumber)) {
                        System.out.println("Min number in array is: " + getMinNumber(listNumber));
                    } else System.out.println("The array is null");
                    break;
                case 5:
                    if (checkEmptyList(listNumber)) {
                        int result = searchNumber(listNumber);
                        if (result == -1) {
                            System.out.println("Your number can't find in array");
                        } else System.out.println(" Your number in index: " + result);
                    } else System.out.println("The array is null");
                    break;
                case 6:
                    out = false;
                    System.out.println("Exit!...");
                    break;
                default:
                    System.out.println(" Pls choose your option in menu!");
            }
        }
    }
}
