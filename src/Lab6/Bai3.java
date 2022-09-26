package Lab6;

public class Bai3 {
    public static void main(String[] args) {
       String str="12345 nabc678";
       char[] charList= str.toCharArray();
        System.out.print("List number in string is: ");
        for (char character : charList) {
            if (Character.isDigit(character)){
                System.out.print(character);
            }
        }
    }
}
