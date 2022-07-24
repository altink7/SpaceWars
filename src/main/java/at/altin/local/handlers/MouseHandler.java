package at.altin.local.handlers;

import at.altin.local.Game;
import at.altin.local.display.ClickArea;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {

    /***
     *
     * @param e
     */

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        int selectedButton=0;
        for(int i=0;i<Game.button_select.length;i++) {
            if (ClickArea.checkCollision(e.getX(), e.getY(), Game.button_select[i])&&Game.phase==2){

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