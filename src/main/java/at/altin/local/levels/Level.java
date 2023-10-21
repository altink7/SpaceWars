package at.altin.local.levels;

import at.altin.local.gameObjects.Spaceship;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public abstract class Level extends Canvas{
    Spaceship spaceship;
    List<Spaceship> enemys = new LinkedList<>();
    int gameover;
    int score;

    public Level(Spaceship spaceship){
        this.spaceship=new Spaceship(spaceship);
    }

    public abstract void drawGraphics(Graphics g);

}
