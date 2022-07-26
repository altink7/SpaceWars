package at.altin.local.gameObjects;

import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy extends GameObject {
    public BufferedImage image= GraphicsLoader.readGraphics("enemy.png");

    public Enemy(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }
}
