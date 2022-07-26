package at.altin.local.gameObjects;

import at.altin.local.display.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Item extends GameObject {

    BufferedImage image;

    public Item(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Item(int x, int y, int width, int height,BufferedImage image) {
        super(x, y, width, height);
        this.image=image;
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics var1) {

    }
}
