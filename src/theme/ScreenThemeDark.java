package theme;

public class ScreenThemeDark extends ScreenThemeStrategy {
    //
    public ScreenThemeDark() {
        this.setBackgroundColor("Black");
        this.setTextColor("White");
        this.setTextFont("Calibri");
    }
    @Override
    public void clickShowAnimationButton() {
        System.out.println("An animation with black holes exploding shows up");
    }
}
