package at.altin.local.levels;
import at.altin.local.Game;
import at.altin.local.gameObjects.Spaceship;
import at.altin.local.service.GraphicsLoader;
import at.altin.local.slides.StaticSlide;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Level1 extends Canvas {
    Spaceship spaceship;
    List<Spaceship> enemys = new LinkedList<>();
    int gameover;
    int score;

    public Level1(Spaceship spaceship){
        this.spaceship=new Spaceship(spaceship);
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public List<Spaceship> getEnemys() {
        return enemys;
    }

    public void setEnemys(List<Spaceship> enemys) {
        this.enemys = enemys;
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
