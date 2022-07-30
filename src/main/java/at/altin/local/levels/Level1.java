package at.altin.local.levels;
import at.altin.local.Game;
import at.altin.local.gameObjects.Item;
import at.altin.local.gameObjects.Spaceship;
import at.altin.local.service.GraphicsLoader;
import at.altin.local.slides.StaticSlide;

import java.awt.*;
import java.util.ArrayList;


public class Level1 extends Level {

    public Level1(Spaceship spaceship){
        super(spaceship);
    }


    public void drawGraphics(Graphics g) {
        spaceship.moveSpaceship();

        StaticSlide level1 = new StaticSlide(Color.lightGray, 1200, 750, spaceship.img_spaceship, spaceship.getX(), spaceship.getY(), "Arial", 2, 48,
                Color.WHITE, " ", 0, 100, 100);
        g.drawImage(GraphicsLoader.readGraphics("level1_background.png"), 0, 0, null);
        level1.drawLevel(g);

        for(Spaceship e:enemys){
            g.drawImage(e.img_spaceship,e.getX(),e.getY(),null);
        }
    }

}

