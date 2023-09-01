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

    public void setHeadline(boolean headline) {
        this.headline = headline;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

    public void setButtons(boolean buttons) {
        this.buttons = buttons;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public void setNavbar(boolean navbar) {
        this.navbar = navbar;
    }

    public void getLayoutDetails() {
        System.out.println("Layout details with the components: ");
        System.out.println(
                            "- buttons:"+(this.buttons ? "on" : "off")+
                            "\n- menu:"+(this.menu ? "on" : "off")+
                            "\n- headline:"+(this.headline ? "on" : "off")+
                            "\n- images:"+(this.images ? "on" : "off")+
                            "\n- navbar:"+(this.navbar ? "on" : "off"));
    }
}
