package theme;

public class ScreenThemeKids extends BaseScreenTheme {
    //
    public ScreenThemeKids() {
        this.setBackgroundColor("Colorized");
        this.setTextColor("FunColor");
        this.setTextFont("ComicSans");
    }

    @Override
    public String clickShowAnimationButton() {
        return "An animation with many Clowns doing tricks shows up";
    }
}
