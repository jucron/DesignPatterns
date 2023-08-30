package strategy;

import strategy.themeStrategy.ScreenThemeStrategy;

public class Screen {
    private ScreenThemeStrategy screenTheme;

    public Screen(ScreenThemeStrategy screenTheme) {
        this.screenTheme = screenTheme;
    }

    public ScreenThemeStrategy getScreenTheme() {
        return screenTheme;
    }

    public void setScreenTheme(ScreenThemeStrategy screenTheme) {
        this.screenTheme = screenTheme;
    }
}
