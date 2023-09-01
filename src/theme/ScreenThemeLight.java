package theme;

public class ScreenThemeLight extends ScreenThemeStrategy {

    public ScreenThemeLight() {
        this.setBackgroundColor("White");
        this.setTextColor("Black");
        this.setTextFont("Arial");
    }
    @Override
    public void clickShowAnimationButton() {
        System.out.println("An animation with many red petals falling over starts");
    }
}
