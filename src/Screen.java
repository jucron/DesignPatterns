import initialScreen.HomePageStrategy;
import layout.ScreenLayout;
import theme.ScreenThemeStrategy;

public class Screen {
    private ScreenThemeStrategy screenTheme;
    private ScreenLayout screenLayout;
    private HomePageStrategy homePage;

    public Screen(ScreenThemeStrategy screenTheme, ScreenLayout screenLayout, HomePageStrategy homePage) {
        this.screenTheme = screenTheme;
        this.screenLayout = screenLayout;
        this.homePage = homePage;
    }
    public void getDetailsOfScreen() {
        if (this.homePage.isLoginLockOn()) {
            this.printLoginRequiredMessage();
        } else {
            this.printDetailsOfScreen();
        }
    }

    private void printDetailsOfScreen() {
        System.out.println("*".repeat(50));
        System.out.println("Details of Screen called:");
        this.screenTheme.getThemeDetails();
        this.screenLayout.getLayoutDetails();
    }

    private void printLoginRequiredMessage() {
        System.out.println("Access not allowed. Please login as Administrator before proceeding.");
    }

    public void clickShowAnimationButton () {
        this.screenTheme.clickShowAnimationButton();
    }

    public ScreenThemeStrategy getScreenTheme() {
        return screenTheme;
    }

    public void setScreenTheme(ScreenThemeStrategy screenTheme) {
        this.screenTheme = screenTheme;
    }
}
