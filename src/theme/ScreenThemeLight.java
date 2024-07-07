package theme;

public class ScreenThemeLight extends ScreenThemeStrategy {

    public ScreenThemeLight() {
        this.setBackgroundColor("White");
        this.setTextColor("Black");
        this.setTextFont("Arial");
    }
    @Override
    public String clickShowAnimationButton() {
        return "An animation with many red petals falling over starts";
    }
}
