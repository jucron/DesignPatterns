package layout;

public class ScreenLayoutConfig {
    private boolean headline;
    private boolean images;
    private boolean buttons;
    private boolean menu;
    private boolean navbar;

    private static ScreenLayoutConfig single_instance;

    private ScreenLayoutConfig() {
        this.headline = false;
        this.images = false;
        this.buttons = false;
        this.menu = false;
        this.navbar = false;
    }
    public static ScreenLayoutConfig getLayoutConfig () {
        if (single_instance == null) {
            single_instance = new ScreenLayoutConfig();
        }
        return single_instance;
    }

    public boolean isHeadline() {
        return headline;
    }

    public void setHeadline(boolean headline) {
        this.headline = headline;
    }

    public boolean isImages() {
        return images;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

    public boolean isButtons() {
        return buttons;
    }

    public void setButtons(boolean buttons) {
        this.buttons = buttons;
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isNavbar() {
        return navbar;
    }

    public void setNavbar(boolean navbar) {
        this.navbar = navbar;
    }
}
