import layout.ScreenLayout;
import theme.ScreenThemeDark;
import theme.ScreenThemeKids;
import theme.ScreenThemeLight;
import theme.ScreenThemeStrategy;

public class ScreenBuilder {
    private Screen screen;
    private ScreenLayout screenLayout = new ScreenLayout();
    private ScreenThemeStrategy screenTheme;

    public ScreenBuilder() {
    }
    public ScreenBuilder withDarkTheme() {
        this.screenTheme = new ScreenThemeDark();
        return this;
    }
    public ScreenBuilder withLightTheme() {
        this.screenTheme = new ScreenThemeLight();
        return this;
    }
    public ScreenBuilder withKidsTheme() {
        this.screenTheme = new ScreenThemeKids();
        return this;
    }
    public ScreenBuilder withHeadline() {
        this.screenLayout.setHeadline(true);
        return this;
    }
    public ScreenBuilder withImages() {
        this.screenLayout.setHeadline(true);
        return this;
    }
    public ScreenBuilder withButtons() {
        this.screenLayout.setHeadline(true);
        return this;
    }
    public ScreenBuilder withMenu() {
        this.screenLayout.setHeadline(true);
        return this;
    }
    public ScreenBuilder withNavbar() {
        this.screenLayout.setHeadline(true);
        return this;
    }
    public Screen build() {
        return new Screen(this.screenTheme,this.screenLayout);
    }
}
