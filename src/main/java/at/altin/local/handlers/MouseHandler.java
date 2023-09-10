package at.altin.local.handlers;

import at.altin.local.Game;
import at.altin.local.display.ClickArea;
import at.altin.local.gameObjects.Spaceship;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    public static int selectedButton=0;

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        for(int i=0;i<Game.button_select.length;i++) {
            if (ClickArea.checkCollision(e.getX(), e.getY(), Game.button_select[i])&&Game.phase==2){
                selectedButton=i+1;
                Game.spaceshipSelected=true;
                //ObjectHandler.addObject(Game.spaceship);
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}