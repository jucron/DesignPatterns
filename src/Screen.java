import layout.ScreenLayout;
import theme.ScreenThemeStrategy;

public class Screen {
    private ScreenThemeStrategy screenTheme;
    private ScreenLayout screenLayout;

    public Screen(ScreenThemeStrategy screenTheme,ScreenLayout screenLayout) {
        this.screenTheme = screenTheme;
        this.screenLayout = screenLayout;
    }
    public void getDetailsOfScreen() {
        System.out.println("*".repeat(50));
        System.out.println("Details of Screen Created:");
        this.screenTheme.getThemeDetails();
        this.screenLayout.getLayoutDetails();
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
