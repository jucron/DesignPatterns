package layout;

public class ScreenLayoutBase implements ScreenLayout {
    public ScreenLayoutBase() {
    }

    public ScreenLayoutConfig getScreenLayoutConfig() {
        return ScreenLayoutConfig.getLayoutConfig();
    }
}
