import layout.ScreenLayout;
import screen.ScreenProxy;
import theme.ScreenThemeStrategy;

public class PrintService {
    public void printDetailsOfScreen(ScreenProxy screen) {
        System.out.println("*".repeat(50));
        System.out.println("Details of screen.Screen called:");
        //Checking if Screen details are authorized
        if (screen.getScreenTheme() == null || screen.getScreenLayout() == null) {
            this.printLoginRequiredMessage();
        } else {
            this.printThemeDetails(screen.getScreenTheme());
            this.printLayoutDetails(screen.getScreenLayout());
        }
    }

    private void printThemeDetails(ScreenThemeStrategy themeStrategy) {
        System.out.println("Theme details with the Style: " + themeStrategy.getClass().getName() + " and settings:");
        System.out.println(
                "- backgroundColor:" + themeStrategy.getBackgroundColor() +
                        "\n- textColor:" + themeStrategy.getTextColor() +
                        "\n- textFont:" + themeStrategy.getTextFont());

    }
    private void printLayoutDetails(ScreenLayout screenLayout) {
        System.out.println("Layout details with the components: ");
        System.out.println(
                "- buttons:"+(screenLayout.getScreenLayoutConfig().isButtons() ? "on" : "off")+
                        "\n- menu:"+(screenLayout.getScreenLayoutConfig().isMenu() ? "on" : "off")+
                        "\n- headline:"+(screenLayout.getScreenLayoutConfig().isHeadline() ? "on" : "off")+
                        "\n- images:"+(screenLayout.getScreenLayoutConfig().isImages() ? "on" : "off")+
                        "\n- navbar:"+(screenLayout.getScreenLayoutConfig().isNavbar() ? "on" : "off"));
    }
    private void printLoginRequiredMessage() {
        System.out.println("Access not allowed. Please login as Administrator before proceeding.");
    }
    public void printAnimation(ScreenProxy screenProxy) {

        System.out.println("The button for animation was clicked:");
        if (screenProxy.getScreenTheme() == null ) {
            this.printLoginRequiredMessage();
        } else {
            System.out.println(" -> "+screenProxy.getScreenTheme().clickShowAnimationButton());
        }
    }
}

