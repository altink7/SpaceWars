package at.altin.local.slides;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DynamicSlide extends Slide{
    public DynamicSlide() {
    }

    public DynamicSlide(Color fillColor, int windowWidth, int windowHeight, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        super(fillColor, windowWidth, windowHeight, font, fontStyle, fontSize, color, message, textWidth, drawStringX, drawStringY);
    }

    public DynamicSlide(Color fillColor, int windowWidth, int windowHeight, BufferedImage image, int imageX, int imageY, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        super(fillColor, windowWidth, windowHeight, image, imageX, imageY, font, fontStyle, fontSize, color, message, textWidth, drawStringX, drawStringY);
    }

    @Override
    public void drawGraphics(Graphics g) {
    }

    @Override
    public void drawLevel(Graphics g) {
    }
}
