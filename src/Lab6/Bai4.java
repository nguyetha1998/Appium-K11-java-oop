package Lab6;

public class Bai4 {

    public static void main(String[] args) {
        String url="http://www.facebook.com";
        System.out.println("Protocol is: "+ url.substring(0,url.indexOf(":")));
        System.out.println("Domain is: "+ url.substring(url.lastIndexOf(".")+1,url.length()));
    }
}
