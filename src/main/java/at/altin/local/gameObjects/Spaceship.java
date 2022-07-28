package at.altin.local.gameObjects;

import at.altin.local.Game;
import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Spaceship extends GameObject {
    boolean running;
    public BufferedImage img_spaceship;
    public List<Item> fire = new ArrayList<>();// nur 1000 amo, sonst gameover
    public int fireCounter =0;

    public Spaceship(){
    }
    public Spaceship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Spaceship(Spaceship other){
        this.img_spaceship =other.img_spaceship;
        this.x=other.x;
        this.y=other.y;
        this.running=other.running;
    }

    public Spaceship(int xVal, int yVal){
        this.x=xVal;
        this.y=yVal;
    }

    public Spaceship(int xVal, int yVal, BufferedImage img){
        this.x=xVal;
        this.y=yVal;
        this.img_spaceship=img;
    }

    public Spaceship(int n, int xVal, int yVal){
        this.img_spaceship =GraphicsLoader.readGraphics("spaceship_"+n+".png");
        this.x = xVal;
        this.y=yVal;
    }

    //Constructors_ENDE

    public BufferedImage getImg_spaceship() {
        return img_spaceship;
    }

    public void setImg_spaceship(int n_img) {
        BufferedImage newImage =GraphicsLoader.readGraphics("spaceship_"+n_img+".png");
        this.img_spaceship = newImage;
        this.width= newImage.getWidth();
        this.height= newImage.getHeight();
    }

    public void checkCollisions(){

    }

    public int checkBordersX(){
        //checkt die Grenzen und sagt in welche richtung man nicht mehr gehen kann-X-Achse
        if(x < 0 ) return 1;
        if(x > Game.WIDTH-width) return 2;
            return 0;
    }

    public int checkBordersY(){
        //checkt die Grenzen und sagt in welche richtung man nicht mehr gehen kann-Y-Achse
        if(y < 0) return 1;
        if(y > Game.HEIGHT-height) return 2;
        return 0;
    }

    public void moveSpaceship(){
            int keyEvent=Game.keyNumber;
            if (keyEvent==2&&checkBordersY()!=2) {
                y += 7;
                //Game.keyNumber=0;
            }
            if (keyEvent==4&&checkBordersX()!=1) {
                x -= 7;
                //Game.keyNumber=0;
            }
            if (keyEvent==8&&checkBordersY()!=1) {
                y -= 7;
                //Game.keyNumber=0;
            }
            if (keyEvent==6&&checkBordersX()!=2) {
                x += 7;
                //Game.keyNumber=0;
            }
    }

    public void showFire(Graphics g, int updateSpeed,int fireSpeed,BufferedImage img) {
        for (Item i : fire) {
            if (i != null) i.updateY(fireSpeed);
        }
        if (fireCounter % updateSpeed == 0) {
                fire.add(new Item(this, img));
        }
        for (int i = 0; i * updateSpeed <= fireCounter; i++) {
            fire.get(i).initFire(g);
        }
        fireCounter++;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }



}
