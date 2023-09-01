package initialScreen;

public class HomePageAdmin implements HomePageStrategy {
    @Override
    public boolean isLoginLockOn() {
        return false;
    }
}
