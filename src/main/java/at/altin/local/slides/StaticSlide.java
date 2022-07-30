package at.altin.local.slides;
import java.awt.*;
import java.awt.image.BufferedImage;

public class StaticSlide extends Slide {


    public StaticSlide() {
    }

    public StaticSlide(Color fillColor, int windowWidth, int windowHeight, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        super(fillColor, windowWidth, windowHeight, font, fontStyle, fontSize, color, message, textWidth, drawStringX, drawStringY);
    }

    public StaticSlide(Color fillColor, int windowWidth, int windowHeight, BufferedImage image, int imageX, int imageY, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
        super(fillColor, windowWidth, windowHeight, image, imageX, imageY, font, fontStyle, fontSize, color, message, textWidth, drawStringX, drawStringY);
    }


    public void drawGraphics(Graphics g){
        g.fillRect(0, 0, windowWidth, windowHeight);
        drawLevel(g);
    }

    public void drawLevel(Graphics g){
        g.drawImage(image, imageX, imageY, null);
        g.setFont(new Font(font, fontStyle, fontSize));
        g.setColor(color);
        String s = message;
        int textW = g.getFontMetrics().stringWidth(s);
        g.drawString(s, drawStringX - textW / 2, drawStringY);
    }
}
