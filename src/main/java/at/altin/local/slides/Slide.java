package at.altin.local.slides;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.image.BufferedImage;

@Getter
@Setter
public abstract class Slide {
    int windowWidth;
    int windowHeight;
    Color fillColor;
    BufferedImage image;
    int imageX;
    int imageY;
    String font;
    int fontStyle;
    int fontSize;
    Color color;
    String message;
    int textWidth;
    int drawStringX;
    int drawStringY;

    public Slide() {
    }

    public Slide(Color fillColor, int windowWidth, int windowHeight, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.font = font;
        this.fontStyle = fontStyle;
        this.fontSize = fontSize;
        this.color = color;
        this.message = message;
        this.textWidth = textWidth;
        this.drawStringX = drawStringX;
        this.drawStringY = drawStringY;
        this.fillColor =fillColor;
    }

    public Slide(Color fillColor, int windowWidth, int windowHeight, BufferedImage image, int imageX, int imageY, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.image = image;
        this.imageX = imageX;
        this.imageY = imageY;
        this.font = font;
        this.fontStyle = fontStyle;
        this.fontSize = fontSize;
        this.color = color;
        this.message = message;
        this.textWidth = textWidth;
        this.drawStringX = drawStringX;
        this.drawStringY = drawStringY;
        this.fillColor =fillColor;
    }

    public abstract void drawGraphics(Graphics g);
    public abstract void drawLevel(Graphics g);
}
