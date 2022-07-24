package at.altin.local.slides;
import java.awt.*;
import java.awt.image.BufferedImage;

public class StaticSlides {
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

    public StaticSlides() {
    }

    public StaticSlides(Color fillColor, int windowWidth, int windowHeight, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
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

    public StaticSlides(Color fillColor, int windowWidth, int windowHeight, BufferedImage image, int imageX, int imageY, String font, int fontStyle, int fontSize, Color color, String message, int textWidth, int drawStringX, int drawStringY) {
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

    public void drawGraphics(Graphics g){
        g.fillRect(0, 0, windowWidth, windowHeight);
        g.drawImage(image, imageX, imageY, null);
        g.setFont(new Font(font, fontStyle, fontSize));
        g.setColor(color);
        String s = message;
        int textW = g.getFontMetrics().stringWidth(s);
        g.drawString(s, drawStringX - textW / 2, drawStringY);
    }

    public void drawGraphics_noImg(Graphics g){
        g.fillRect(0, 0, windowWidth, windowHeight);
        g.setFont(new Font(font, fontStyle, fontSize));
        g.setColor(color);
        String s = message;
        int textW = g.getFontMetrics().stringWidth(s);
        g.drawString(s, drawStringX - textW / 2, drawStringY);
    }


    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getImageX() {
        return imageX;
    }

    public void setImageX(int imageX) {
        this.imageX = imageX;
    }

    public int getImageY() {
        return imageY;
    }

    public void setImageY(int imageY) {
        this.imageY = imageY;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(int fontStyle) {
        this.fontStyle = fontStyle;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTextWidth() {
        return textWidth;
    }

    public void setTextWidth(int textWidth) {
        this.textWidth = textWidth;
    }

    public int getDrawStringX() {
        return drawStringX;
    }

    public void setDrawStringX(int drawStringX) {
        this.drawStringX = drawStringX;
    }

    public int getDrawStringY() {
        return drawStringY;
    }

    public void setDrawStringY(int drawStringY) {
        this.drawStringY = drawStringY;
    }
}
