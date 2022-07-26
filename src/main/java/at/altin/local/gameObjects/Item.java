package at.altin.local.gameObjects;

import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Item extends GameObject {

    public BufferedImage image;


    public Item(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Item(int x, int y, int width, int height,BufferedImage image) {
        super(x, y, width, height);
        this.image=image;
    }
    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void initFire(Spaceship spaceship, Graphics g){
        image = GraphicsLoader.readGraphics("spaceship_fire.png");

            setX(spaceship.xVal+image.getWidth());
            setY(spaceship.yVal-image.getHeight());
            setWidth(image.getWidth());
            setHeight(image.getHeight());
            setImage(image);

            g.drawImage(image,getX(),getY(),null);

    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics var1) {

    }
}
