package at.altin.local.display;

import at.altin.local.Game;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;

public class Window extends JFrame {
    public Window(int width, int height, String title, Game game) {
        try {
            game.serverSocket = new ServerSocket(9999);
        } catch (IOException var6) {
            System.out.println("Spiel bereits gestartet!");
            System.exit(0);
        }

        this.setTitle(title);
        this.pack();
        this.setSize(width + this.getInsets().left + this.getInsets().right, height + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.add(game);
        game.start();
    }
}
