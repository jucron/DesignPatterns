package theme;

public abstract class ScreenThemeStrategy {
    private String backgroundColor;
    private String textColor;
    private String textFont;

    public void getThemeDetails() {
        System.out.println("Theme details with the Style: "+getClass().getName()+" and settings:");
        System.out.println(
                "- backgroundColor:"+this.backgroundColor+
                "\n- textColor:"+this.textColor+
                "\n- textFont:"+this.textFont);
    }
    public abstract void clickShowAnimationButton();

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public void setTextFont(String textFont) {
        this.textFont = textFont;
    }
}
