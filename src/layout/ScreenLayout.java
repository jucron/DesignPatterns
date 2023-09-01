package layout;

public class ScreenLayout {
    private boolean headline;
    private boolean images;
    private boolean buttons;
    private boolean menu;
    private boolean navbar;

    public ScreenLayout() {
        this.headline = false;
        this.images = false;
        this.buttons = false;
        this.menu = false;
        this.navbar = false;
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

    public void getLayoutDetails() {
        System.out.println("Layout details with the components: ");
        System.out.println(
                        "- buttons:"+(this.buttons ? "on" : "off")+
                        "\n- headline:"+(this.headline ? "on" : "off")+
                        "\n- images:"+(this.images ? "on" : "off")+
                        "\n- menu:"+(this.menu ? "on" : "off")+
                        "\n- navbar:"+(this.navbar ? "on" : "off"));
    }
}
