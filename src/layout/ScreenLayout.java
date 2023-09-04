package layout;

public class ScreenLayout {
    public ScreenLayout() {
    }

    public ScreenLayoutConfig getScreenLayoutConfig() {
        return ScreenLayoutConfig.getLayoutConfig();
    }

    public void getLayoutDetails() {
        System.out.println("Layout details with the components: ");
        System.out.println(
                            "- buttons:"+(this.getScreenLayoutConfig().isButtons() ? "on" : "off")+
                            "\n- menu:"+(this.getScreenLayoutConfig().isMenu() ? "on" : "off")+
                            "\n- headline:"+(this.getScreenLayoutConfig().isHeadline() ? "on" : "off")+
                            "\n- images:"+(this.getScreenLayoutConfig().isImages() ? "on" : "off")+
                            "\n- navbar:"+(this.getScreenLayoutConfig().isNavbar() ? "on" : "off"));
    }
}
