package at.altin.local.gameObjects;

import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Item extends GameObject {

    public BufferedImage image=GraphicsLoader.readGraphics("spaceship_fire.png");


    public Item(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Item(Spaceship spaceship) {
        setX(spaceship.xVal+image.getWidth()/2+20);
        setY(spaceship.yVal-image.getHeight());
        this.width=image.getWidth();
        this.height=image.getHeight();
    }
    public Item(Enemy spaceship) {
        setX(spaceship.xVal+image.getWidth()/2+20);
        setY(spaceship.yVal-image.getHeight());
        this.width=image.getWidth();
        this.height=image.getHeight();
    }
    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void initFire(Graphics g){
            g.drawImage(image,getX(),getY(),null);
    }
    public void updateY(int fireSpeed){
            setY(y-=fireSpeed);
    }


    @Override
    public void tick(){
    }

    @Override
    public void render(Graphics g) {
    }
}
