package strategy.themeStrategy;

public abstract class ScreenThemeStrategy {
    private String backgroundColor;
    private String textColor;
    private String textFont;

    public void execute() {
        System.out.println("*".repeat(50));
        System.out.println("Theme executed with the Style: "+getClass().getName());
        System.out.println("Settings: " +
                "\nbackgroundColor:"+this.backgroundColor+
                "\ntextColor:"+this.textColor+
                "\ntextFont:"+this.textFont);
    }

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
