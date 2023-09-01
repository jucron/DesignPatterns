package initialScreen;

public class HomePageUser implements HomePageStrategy {
    @Override
    public boolean isLoginLockOn() {
        return true;
    }
}
