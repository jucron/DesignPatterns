import strategy.ScreenThemeKids;

public class Main {
    public static void main(String[] args) {
        //
        ScreenBuilder screenBuilder = new ScreenBuilder();
        Screen screen = screenBuilder.
                withDarkTheme().
                withLightTheme().
                withButtons().
                withHeadline().
                build();

        //
        screen.getDetailsOfScreen();
        //

    }
}
