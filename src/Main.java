import strategy.Screen;
import strategy.themeStrategy.ScreenThemeDark;
import strategy.themeStrategy.ScreenThemeKids;

public class Main {
    public static void main(String[] args) {
        //
        Screen screen = new Screen(new ScreenThemeDark());
        //
        screen.getScreenTheme().execute();
        //
        screen.setScreenTheme(new ScreenThemeKids());
        //
        screen.getScreenTheme().execute();
        //
    }
}
