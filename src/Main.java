import initialScreen.HomePageType;
import layout.ScreenLayout;
import layout.ScreenLayoutType;

public class Main {
    public static void main(String[] args) {
        //
        ScreenLayoutType layoutChosen = ScreenLayoutType.TYPE_A;
        HomePageType accessTypeChose = HomePageType.ADMIN_NOT_REQUIRED;
        //
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenDarkTheme(layoutChosen, accessTypeChose);
        //
        screen.getDetailsOfScreen();
        screen.clickShowAnimationButton();
        //
    }
}
