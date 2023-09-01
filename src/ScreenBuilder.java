import initialScreen.HomePageAdmin;
import initialScreen.HomePageStrategy;
import initialScreen.HomePageUser;
import layout.ScreenLayout;
import theme.ScreenThemeDark;
import theme.ScreenThemeKids;
import theme.ScreenThemeLight;
import theme.ScreenThemeStrategy;

public class ScreenBuilder {
    private ScreenLayout screenLayout = new ScreenLayout();
    private ScreenThemeStrategy screenTheme;
    private HomePageStrategy homePage;

    public ScreenBuilder() {
    }
    public ScreenBuilder withHomePageAdmin() {
        this.homePage = new HomePageAdmin();
        return this;
    }
    public ScreenBuilder withHomePageUser() {
        this.homePage = new HomePageUser();
        return this;
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
        this.screenLayout.setImages(true);
        return this;
    }
    public ScreenBuilder withButtons() {
        this.screenLayout.setButtons(true);
        return this;
    }
    public ScreenBuilder withMenu() {
        this.screenLayout.setMenu(true);
        return this;
    }
    public ScreenBuilder withNavbar() {
        this.screenLayout.setNavbar(true);
        return this;
    }
    public Screen build() {
        return new Screen(this.screenTheme,this.screenLayout, this.homePage);
    }
}
