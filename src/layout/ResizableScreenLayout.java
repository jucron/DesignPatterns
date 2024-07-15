package layout;

public class ResizableScreenLayout extends ScreenLayout implements ResizableLayout{
    @Override
    public String resizeLayout(int width, int height) {
        //Will resize the layout in case the page changes measures
        return ("resized layout to "+width + " x " + height);
    }
}
