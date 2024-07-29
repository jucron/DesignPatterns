package layout;

public class ResizableScreenLayout extends ResizableLayoutDecorator {
    private ScreenLayout screenLayout;

    public ResizableScreenLayout(ScreenLayoutBase screenLayoutBase) {
        super(screenLayoutBase);
    }

    @Override
    public String resizeLayout(int width, int height) {
        //Will resize the layout in case the page changes measures
        return ("resized layout to "+width + " x " + height);
    }

    @Override
    public ScreenLayoutConfig getScreenLayoutConfig() {
        return this.screenLayout.getScreenLayoutConfig();
    }
}