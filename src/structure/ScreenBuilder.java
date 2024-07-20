package structure;

import homePage.HomePageAdmin;
import homePage.HomePageStrategy;
import homePage.HomePageUser;
import layout.ScreenLayoutBase;
import screen.Screen;
import theme.*;

public class ScreenBuilder {
    private ScreenLayoutBase screenLayout = new ScreenLayoutBase();
    private BaseScreenTheme screenTheme;
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
    public ScreenBuilder withLightThemeStatic() {
        this.screenTheme = new ScreenThemeLightStatic();
        return this;
    }
    public ScreenBuilder withKidsTheme() {
        this.screenTheme = new ScreenThemeKids();
        return this;
    }
    public ScreenBuilder withHeadline() {
        this.screenLayout.getScreenLayoutConfig().setHeadline(true);
        return this;
    }
    public ScreenBuilder withImages() {
        this.screenLayout.getScreenLayoutConfig().setImages(true);
        return this;
    }
    public ScreenBuilder withButtons() {
        this.screenLayout.getScreenLayoutConfig().setButtons(true);
        return this;
    }
    public ScreenBuilder withMenu() {
        this.screenLayout.getScreenLayoutConfig().setMenu(true);
        return this;
    }
    public ScreenBuilder withNavbar() {
        this.screenLayout.getScreenLayoutConfig().setNavbar(true);
        return this;
    }
    public Screen build() {
        return new Screen(this.screenTheme,this.screenLayout, this.homePage);
    }
}
