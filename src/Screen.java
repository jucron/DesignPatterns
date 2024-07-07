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

    public ScreenThemeStrategy getScreenTheme() {
        if (this.homePage.isLoginLockOn()) {
            return null;
        } else {
            return screenTheme;
        }
    }

    public ScreenLayout getScreenLayout() {
        if (this.homePage.isLoginLockOn()) {
            return null;
        } else {
            return screenLayout;
        }
    }
}
