package at.altin.local.levels;
import at.altin.local.Game;
import at.altin.local.gameObjects.Spaceship;
import at.altin.local.handlers.ObjectHandler;
import at.altin.local.service.GraphicsLoader;
import at.altin.local.slides.StaticSlide;

import java.awt.*;


public class level1 extends Canvas {
    Spaceship spaceship;
    int gameover;
    int score;

    public level1(Spaceship spaceship){
        this.spaceship=new Spaceship(spaceship);
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public void drawGraphics(Graphics g){
        spaceship.moveSpaceship();

        StaticSlide level1 = new StaticSlide(Color.lightGray,1200,750,spaceship.img_spaceship,spaceship.xVal, spaceship.yVal,"Arial", 2,48,
                Color.WHITE," ",0,100,100);
        g.drawImage(GraphicsLoader.readGraphics("level1_background.png"),0,0,null);
        level1.drawLevel(g);
        spaceship.initFire(g);

    }
}
