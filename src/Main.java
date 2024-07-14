import homePage.HomePageType;
import layout.ScreenLayoutType;
import screen.Screen;
import screen.ScreenProxy;
import screen.SecurityCredentials;
import structure.ScreenFactory;

public class Main {
    public static void main(String[] args) {
        //Defining layout and access type of homepage
        ScreenLayoutType layoutChosen = ScreenLayoutType.TYPE_A;
        HomePageType accessTypeChose = HomePageType.ADMIN_HOME_PAGE;
        //Creating a screen.Screen with theme DARK (creation is abstracted by the Factory)
        ScreenFactory factory = new ScreenFactory();
        Screen screen = factory.createScreenDarkTheme(layoutChosen, accessTypeChose);
        //Using the ScreenProxy to run access requirements
        SecurityCredentials securityCredentials = new SecurityCredentials("admin","password123");
        ScreenProxy screenProxy = new ScreenProxy(screen,securityCredentials);
        //Printing results via the PrintService
        PrintService printService = new PrintService();
        printService.printDetailsOfScreen(screenProxy);
        printService.printAnimation(screenProxy);
    }
}
