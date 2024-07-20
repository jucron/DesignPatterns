package theme;


public abstract class BaseScreenTheme implements ScreenThemeStrategy {
    private String backgroundColor;
    private String textColor;
    private String textFont;

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public void setTextFont(String textFont) {
        this.textFont = textFont;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getTextColor() {
        return textColor;
    }

    @Override
    public String getTextFont() {
        return textFont;
    }
}
