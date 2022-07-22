package at.altin.local.handlers;
import at.altin.local.Game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    /***
     *
     * @param e
     */

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int n= e.getKeyCode();
        if(n==KeyEvent.VK_SPACE){
            Game.keyNumber=10;
        }
        if(n==KeyEvent.VK_UP){
            Game.keyNumber=8;
        }
        if(n==KeyEvent.VK_DOWN){
            Game.keyNumber=2;
        }
        if(n==KeyEvent.VK_LEFT){
            Game.keyNumber=4;
        }
        if(n==KeyEvent.VK_RIGHT){
            Game.keyNumber=6;
        }

    }

    public void keyReleased(KeyEvent e) {
    }
}
