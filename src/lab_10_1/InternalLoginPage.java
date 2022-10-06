package lab_10_1;

public class InternalLoginPage extends LoginPage {
    private static final String USER_NAME = "#username";
    private static final String PASSWORD = "#password";
    private static final String LOGIN_BTN = "#loginBtn";

    @Override
    public void inputUserName(String userName) {
        System.out.printf("Login with user name as %s in locator %s \n ", userName, USER_NAME);
    }

    @Override
    public void inputPassword(String password) {
        System.out.printf("Login with password as %s in locator %s \n ", password, PASSWORD);
    }

    @Override
    public void clickOnButtonLogin() {
        System.out.printf("Click on button %s \n ", LOGIN_BTN);
    }
}
