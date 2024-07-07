import initialScreen.HomePageType;
import layout.ScreenLayoutType;

public class Main {
    public static void main(String[] args) {
        //Defining layout and access type of homepage
        ScreenLayoutType layoutChosen = ScreenLayoutType.TYPE_A;
        HomePageType accessTypeChose = HomePageType.ADMIN_NOT_REQUIRED;
        //Creating a Screen with theme DARK (creation is abstracted by the Factory)
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenDarkTheme(layoutChosen, accessTypeChose);
        //Printing results via the PrintService
        PrintService printService = new PrintService();
        printService.printDetailsOfScreen(screen);
        printService.printAnimation(screen);
    }
}
