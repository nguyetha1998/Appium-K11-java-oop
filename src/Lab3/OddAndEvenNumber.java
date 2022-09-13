package Lab3;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 22, 5, 17, 31, 26, 12, 55, 32};
        int countOdd=0;
        int countEven=0;
        for (int value : arr) {
            if (value % 2 == 0) {

                countEven++;
            } else countOdd++;

        }
        System.out.println("Total Odd: "+ countOdd +"\nTotal Even: "+countEven);
    }
}
