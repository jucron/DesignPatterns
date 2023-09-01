package theme;

public class ScreenThemeKids extends ScreenThemeStrategy {
    //
    public ScreenThemeKids() {
        this.setBackgroundColor("Colorized");
        this.setTextColor("FunColor");
        this.setTextFont("ComicSans");
    }

    @Override
    public void clickShowAnimationButton() {
        System.out.println("An animation with many Clowns doing tricks shows up");
    }
}
