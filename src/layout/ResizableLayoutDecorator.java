package layout;

public abstract class ResizableLayoutDecorator implements ScreenLayout{
    private ScreenLayout screenLayout;

    public ResizableLayoutDecorator(ScreenLayoutBase screenLayoutBase) {
        this.screenLayout = screenLayoutBase;
    }

    //new methods
    abstract String resizeLayout(int width, int height);
}
