package at.altin.local.levels;
import at.altin.local.gameObjects.Spaceship;
import at.altin.local.handlers.ObjectHandler;
import at.altin.local.slides.StaticSlide;

import java.awt.*;


public class level1 extends Canvas {
    Spaceship spaceship =new Spaceship();
    int gameover;
    int score;

    public level1(Spaceship spaceship){
        this.spaceship=spaceship;
    }


    StaticSlide level1 = new StaticSlide(Color.lightGray,1200,750, spaceship.img_spaceship, 0,0,"Arial", 2,48,
            Color.WHITE,"Wähle dein Raumschiff!",0,WIDTH/2,100);

    public void drawGraphics(Graphics g){
        level1.drawGraphics(g);
    }
}
