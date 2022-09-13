package Lab3;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 22, 5, 17, 31, 26, 12, 55, 32};
        for (int i = 0; i < arr.length-1; i++) {
            int b;
            if (arr[i]> arr[i+1]){
                b= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=b;
            }
            System.out.println(arr[i]);
        }

    }
}
