package screen;

import layout.ScreenLayout;
import theme.ScreenThemeStrategy;

public class ScreenProxy implements IScreen{
    private Screen screen;
    private SecurityCredentials credentials;

    public ScreenProxy(Screen screen, SecurityCredentials credentials) {
        this.screen = screen;
        this.credentials = credentials;
    }
    @Override
    public ScreenThemeStrategy getScreenTheme() {
        if (screen.isLoginAdminOn()){
            if (authenticate(credentials)) {
                return screen.getScreenTheme();
            }
        }
        return null;
    }

    @Override
    public ScreenLayout getScreenLayout() {
        if (screen.isLoginAdminOn()){
            if (authenticate(credentials)) {
                return screen.getScreenLayout();
            }
        }
        return null;
    }

    private boolean authenticate(SecurityCredentials credentials) {
        // Simple authentication logic for illustration
        // In real-world applications, this should involve secure validation mechanisms
        return "admin".equals(credentials.getUsername()) && "password123".equals(credentials.getPassword());
    }
}
