package at.altin.local.gameObjects;

import at.altin.local.Game;
import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class Spaceship extends GameObject {
    boolean border_top;
    boolean border_bottom;
    boolean border_right;
    boolean border_left;
    boolean running;
    public int xVal;
    public int yVal;
    public BufferedImage img_spaceship;

    public Spaceship(){

    }
    public Spaceship(int xVal, int yVal){
        this.xVal=xVal;
        this.yVal=yVal;
    }
    public Spaceship(int n, int xVal, int yVal){
        this.img_spaceship =GraphicsLoader.readGraphics("spaceship_"+n+".png");
        this.xVal=xVal;
        this.yVal=yVal;
    }

    public BufferedImage getImg_spaceship() {
        return img_spaceship;
    }

    public void setImg_spaceship(int n_img) {
        this.img_spaceship = GraphicsLoader.readGraphics("spaceship_"+n_img+".png");
    }

    public Spaceship(Spaceship other){
        this.img_spaceship =other.img_spaceship;
        this.xVal=other.xVal;
        this.yVal=other.yVal;
    }


    public Spaceship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void checkCollisions(){

    }

    public void checkBorders(int border_top, int border_bottom, int border_right, int border_left){

    }

    public void moveSpaceship(){
        int keyEvent = Game.keyNumber;
        if(keyEvent==2){
            yVal+=5;
            //Game.keyNumber=0;
        }
        if(keyEvent==4){
            xVal-=5;
            //Game.keyNumber=0;
        }
        if(keyEvent==8){
            yVal-=5;
            //Game.keyNumber=0;
        }
        if(keyEvent==6){
            xVal+=5;
            //Game.keyNumber=0;
        }
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics var1) {

    }



}
