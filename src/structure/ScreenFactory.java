package structure;

import homePage.HomePageType;
import layout.ScreenLayoutType;
import screen.Screen;

public class ScreenFactory {
    private final ScreenBuilder screenBuilder = new ScreenBuilder();

    public ScreenFactory() {
    }
    public Screen createScreenDarkTheme(ScreenLayoutType layoutType, HomePageType homePageType) {
        ScreenBuilder builderWithTheme = this.createHomePage(homePageType).withDarkTheme();
        return this.createScreen(layoutType,builderWithTheme);
    }
    public Screen createScreenLightTheme(ScreenLayoutType layoutType, HomePageType homePageType) {
        ScreenBuilder builderWithTheme = this.createHomePage(homePageType).withLightTheme();
        return this.createScreen(layoutType,builderWithTheme);
    }
    public Screen createScreenLightThemeStatic(ScreenLayoutType layoutType, HomePageType homePageType) {
        ScreenBuilder builderWithTheme = this.createHomePage(homePageType).withLightThemeStatic();
        return this.createScreen(layoutType,builderWithTheme);
    }
    public Screen createScreenKidsTheme(ScreenLayoutType layoutType, HomePageType homePageType) {
        ScreenBuilder builderWithTheme = this.createHomePage(homePageType).withKidsTheme();
        return this.createScreen(layoutType,builderWithTheme);
    }
    private ScreenBuilder createHomePage(HomePageType homePageType) {
        if (homePageType == HomePageType.ADMIN_HOME_PAGE) {
            return screenBuilder.withHomePageAdmin();
        }
        return screenBuilder.withHomePageUser();
    }
    private Screen createScreen(ScreenLayoutType layoutType, ScreenBuilder builderWithTheme) {
        switch (layoutType) {
            /*
            TypeA: Simplest setting
            TypeB: Contains Image
            TypeC: Contains Image and Navbar (TypeC is default)
             */
            case TYPE_A:
                return this.createLayoutTypeA(builderWithTheme);
            case TYPE_B:
                return this.createLayoutTypeB(builderWithTheme);
            default:
                return this.createLayoutTypeC(builderWithTheme);
        }
    }

    private Screen createLayoutTypeA(ScreenBuilder screenBuilder) {
        return this.screenBuilder.
                withMenu().
                withButtons().
                withHeadline().
                build();
    }
    private Screen createLayoutTypeB(ScreenBuilder screenBuilder) {
        return this.screenBuilder.
                withMenu().
                withButtons().
                withHeadline().
                withImages().
                build();
    }
    private Screen createLayoutTypeC(ScreenBuilder screenBuilder) {
        return this.screenBuilder.
                withMenu().
                withButtons().
                withHeadline().
                withImages().
                withNavbar().
                build();
    }

}
