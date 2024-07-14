package screen;

import layout.ScreenLayout;
import theme.ScreenThemeStrategy;

public interface IScreen {
    ScreenThemeStrategy getScreenTheme();
    ScreenLayout getScreenLayout();

}
