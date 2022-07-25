package at.altin.local.gameObjects;

import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Spaceship extends GameObject {
    boolean border_top;
    boolean border_bottom;
    boolean border_right;
    boolean border_left;
    boolean running;
    public BufferedImage img_spaceship;

    public Spaceship(){

    }
    public Spaceship(int n){
        this.img_spaceship =GraphicsLoader.readGraphics("spaceship_"+n+".png");
    }

    public Spaceship(Spaceship other){
        this.img_spaceship =other.img_spaceship;
    }


    public Spaceship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void checkCollisions(){

    }

    public void checkBorders(int border_top, int border_bottom, int border_right, int border_left){

    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics var1) {

    }



}
