package lab_10_1;

public abstract class LoginPage {


    public abstract void inputUserName(String userName);

    public abstract void inputPassword(String password);

    public abstract void clickOnButtonLogin();

    public void login(String userName, String password) {
        inputUserName(userName);
        inputPassword(password);
        clickOnButtonLogin();
    }
}
