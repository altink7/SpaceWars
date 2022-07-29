package at.altin.local.levels;

import at.altin.local.gameObjects.Spaceship;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class Level extends Canvas{
    Spaceship spaceship;
    List<Spaceship> enemys = new LinkedList<>();
    int gameover;
    int score;

    public Level(Spaceship spaceship){
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

    public abstract void drawGraphics(Graphics g);

}
