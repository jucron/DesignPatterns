package theme;

public class ScreenThemeDark extends BaseScreenTheme {
    //
    public ScreenThemeDark() {
        this.setBackgroundColor("Black");
        this.setTextColor("White");
        this.setTextFont("Calibri");
    }
    @Override
    public String clickShowAnimationButton() {
        return "An animation with black holes exploding shows up";
    }
}
