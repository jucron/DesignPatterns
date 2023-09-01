import initialScreen.HomePageType;
import layout.ScreenLayoutType;

public class Main {
    public static void main(String[] args) {
        //
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenLightTheme(ScreenLayoutType.TYPE_B, HomePageType.HOME_PAGE_ADMIN);
        //
        screen.getDetailsOfScreen();
        screen.clickShowAnimationButton();
        //
    }
}
