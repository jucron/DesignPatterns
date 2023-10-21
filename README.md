# DesignPatterns
This project is about testing Design Patterns in a small simulation of a fucntioning App. 

### Theme: Homepage Screen Startup
This app will simulate a setup of Screens of webpages. This will include setting up the screen theme, layout, colors, components and User access.

### Usage example
Input:
``` 
ScreenLayoutType layoutChosen = ScreenLayoutType.TYPE_A;
HomePageType accessTypeChose = HomePageType.ADMIN_NOT_REQUIRED;
//
ScreenFactory factory = new ScreenFactory();
Screen screen = factory.createScreenDarkTheme(layoutChosen, accessTypeChose);
//
screen.getDetailsOfScreen();
screen.clickShowAnimationButton();
```
Output
``` 
**************************************************
Details of Screen called:
Theme details with the Style: theme.ScreenThemeDark and settings:
- backgroundColor:Black
- textColor:White
- textFont:Calibri
Layout details with the components: 
- buttons:on
- menu:on
- headline:on
- images:off
- navbar:off
An animation with black holes exploding shows up
```

### Designs implemented (so far)
1. [Factory](#factory)
2. [Builder](#builder)
3. [Singleton](#singleton)
4. [Strategy](#strategy)

## Factory
![img_2.png](img_2.png)



## Builder
![img_3.png](img_3.png)

## Singleton
![img_4.png](img_4.png)

## Strategy
Screen Theme Strategy

![img.png](img.png)

Access Type Strategy

![img_1.png](img_1.png)

