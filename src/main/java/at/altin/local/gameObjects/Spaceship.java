package at.altin.local.gameObjects;

import at.altin.local.Game;
import at.altin.local.display.GameObject;
import at.altin.local.service.GraphicsLoader;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@SuppressWarnings("unused")
public class Spaceship extends GameObject {
    long id;
    boolean running;
    public BufferedImage img_spaceship;
    public List<Item> fire = new ArrayList<>();// nur 1000 amo, sonst game over
    public int fireCounter =0;
    Random random =new Random();

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
        this.fire=other.fire;
        this.fireCounter=other.fireCounter;
        this.random=other.random;
        this.id=other.id;
        this.width=other.width;
        this.height=other.height;
    }

    public Spaceship(int xVal, int yVal){
        this.x=xVal;
        this.y=yVal;
    }

    public Spaceship(int xVal, int yVal, BufferedImage img,long id){
        this.x=xVal;
        this.y=yVal;
        this.img_spaceship=img;
        this.width=img.getWidth();
        this.height=img.getHeight();
        this.id=id;
    }

    public Spaceship(int n, int xVal, int yVal){
        this.img_spaceship =GraphicsLoader.readGraphics("spaceship_"+n+".png");
        this.width=img_spaceship.getWidth();
        this.height=img_spaceship.getHeight();
        this.x = xVal;
        this.y=yVal;
    }

    public void setImg_spaceship(int n_img) {
        BufferedImage newImage =GraphicsLoader.readGraphics("spaceship_"+n_img+".png");
        this.img_spaceship = newImage;
        this.width= newImage.getWidth();
        this.height= newImage.getHeight();
    }

    public int checkBordersX(){
        //checkt die Grenzen und sagt in welche richtung man nicht mehr gehen kann-X-Achse
        if(x < 0 ){
            return 1;
        }

        if(x > Game.WIDTH-width){
            return 2;
        }

        return 0;
    }

    public int checkBordersY(){
        //checkt die Grenzen und sagt in welche richtung man nicht mehr gehen kann-Y-Achse
        if(y < 0){
            return 1;
        }
        if(y > Game.HEIGHT-height){
            return 2;
        }

        return 0;
    }

    public void moveSpaceship(){
            int keyEvent=Game.keyNumber;
            if (keyEvent==2&&checkBordersY()!=2) {
                y += 9;
                //Game.keyNumber=0;
            }
            if (keyEvent==4&&checkBordersX()!=1) {
                x -= 9;
                //Game.keyNumber=0;
            }
            if (keyEvent==8&&checkBordersY()!=1) {
                y -= 9;
                //Game.keyNumber=0;
            }
            if (keyEvent==6&&checkBordersX()!=2) {
                x += 9;
                //Game.keyNumber=0;
            }
    }

    public void showFire(Graphics g, int updateSpeed,int fireSpeed,BufferedImage img,boolean enemy) {
        for (Item i : fire) {
            if (i != null) i.updateY(fireSpeed);
        }
        if (fireCounter % updateSpeed == 0){
            if(!(random.nextBoolean()&&enemy)) {
                fire.add(new Item(this, img, enemy));
            }

        }
        for(Item i:fire){
            i.initFire(g);
        }

        fireCounter++;
    }

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
    }

    @Override
    public Point getPoint() {
        return new Point(getX(), getY());
    }
}
