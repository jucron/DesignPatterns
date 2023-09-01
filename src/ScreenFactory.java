import layout.ScreenLayoutType;

public class ScreenFactory {
    private final ScreenBuilder screenBuilder = new ScreenBuilder();

    public ScreenFactory() {
    }
    public Screen createScreenDarkTheme(ScreenLayoutType layoutType) {
        ScreenBuilder builderWithTheme = screenBuilder.withDarkTheme();
        return this.createScreen(layoutType,builderWithTheme);
    }
    public Screen createScreenLightTheme(ScreenLayoutType layoutType) {
        ScreenBuilder builderWithTheme = screenBuilder.withLightTheme();
        return this.createScreen(layoutType,builderWithTheme);
    }
    public Screen createScreenKidsTheme(ScreenLayoutType layoutType) {
        ScreenBuilder builderWithTheme = screenBuilder.withKidsTheme();
        return this.createScreen(layoutType,builderWithTheme);
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
                withButtons().
                withHeadline().
                build();
    }
    private Screen createLayoutTypeB(ScreenBuilder screenBuilder) {
        return this.screenBuilder.
                withButtons().
                withHeadline().
                withImages().
                build();
    }
    private Screen createLayoutTypeC(ScreenBuilder screenBuilder) {
        return this.screenBuilder.
                withButtons().
                withHeadline().
                withImages().
                withNavbar().
                build();
    }

}
