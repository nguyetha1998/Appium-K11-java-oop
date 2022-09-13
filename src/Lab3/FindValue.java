package Lab3;

public class FindValue {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 22, 5, 17, 31, 26, 12, 55, 32};
        int maxValue = arr[0];
        int minValue = arr[0];
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            } else if
            (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("Max value: " + maxValue + "\nMin value: " + minValue);
    }
}
