import layout.ScreenLayoutType;

public class Main {
    public static void main(String[] args) {
        //
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenKidsTheme(ScreenLayoutType.TYPE_B);
        //
        screen.getDetailsOfScreen();
        screen.clickShowAnimationButton();
        //
    }
}
