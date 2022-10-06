package lab_10_1;

public class LoginFlow {
   private String userName;
   private String password;

    public LoginFlow(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public  void loginWithCred( LoginPage loginPage){
        loginPage.login(userName,password);
    }

}
