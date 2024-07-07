package theme;


public abstract class ScreenThemeStrategy {
    private String backgroundColor;
    private String textColor;
    private String textFont;

    public abstract String clickShowAnimationButton();

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public void setTextFont(String textFont) {
        this.textFont = textFont;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getTextFont() {
        return textFont;
    }
}
