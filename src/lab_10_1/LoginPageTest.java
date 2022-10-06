package lab_10_1;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginFlow loginFlow= new LoginFlow("Nguyet Ha","12345");
        LoginPage internalLoginPage= new InternalLoginPage();
        LoginPage externalLoginPage= new ExternalLoginPage();
        loginFlow.loginWithCred(internalLoginPage);
        loginFlow.loginWithCred(externalLoginPage);

    }
}
