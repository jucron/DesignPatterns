package screen;

import homePage.HomePageStrategy;
import layout.ResizableScreenLayout;
import layout.ScreenLayout;
import theme.ScreenThemeStrategy;

public class Screen implements IScreen{
    private ScreenThemeStrategy screenTheme;
    private ScreenLayout screenLayout;
    private HomePageStrategy homePage;

    public Screen(ScreenThemeStrategy screenTheme, ScreenLayout screenLayout, HomePageStrategy homePage) {
        this.screenTheme = screenTheme;
        this.screenLayout = screenLayout;
        this.homePage = homePage;
    }

    @Override
    public ScreenThemeStrategy getScreenTheme() {
            return screenTheme;
    }

    @Override
    public ScreenLayout getScreenLayout() {
            return screenLayout;
    }
    public boolean isLoginAdminOn(){
        return this.homePage.isLoginAdminOn();
    }
    public String resizeScreen (int width, int height) {
        if (this.getScreenLayout() instanceof ResizableScreenLayout) {
            return ((ResizableScreenLayout) this.getScreenLayout()).resizeLayout(width,height);
        }
        return null;
    }
}
