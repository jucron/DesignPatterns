package homePage;

public class HomePageUser implements HomePageStrategy {
    @Override
    public boolean isLoginAdminOn() {
        return false;
    }
}
