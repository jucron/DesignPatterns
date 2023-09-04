import initialScreen.HomePageType;
import layout.ScreenLayout;
import layout.ScreenLayoutType;

public class Main {
    public static void main(String[] args) {
        //
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenDarkTheme(ScreenLayoutType.TYPE_A, HomePageType.ADMIN_NOT_REQUIRED);
        //
        screen.getDetailsOfScreen();
        screen.clickShowAnimationButton();
        //
    }
}
