package at.altin.local;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 1300;
    static final int SCREEN_HEIGHT = 750;
    static final int UNIT_SIZE = 50;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    static final int DELAY = 175;
    final int[][] x = new int[GAME_UNITS*10][2];
    final int[][] y = new int[GAME_UNITS*10][2];

    int Farbe=6;

    char direction = 'R';
    boolean running = false;
    boolean statistik =false;
    boolean home =true;

    Timer timer;
    Random random;

    BufferedImage image;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.darkGray);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (home) {
            g.drawImage(image, 132,50,null);

            g.setColor(Color.BLACK);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Welcome to Game", (SCREEN_WIDTH - metrics.stringWidth("Welcome to Game")) / 2, g.getFont().getSize()+50);

            g.setColor(Color.lightGray);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            FontMetrics metrics2 = getFontMetrics(g.getFont());
            g.drawString("Press SPACE to continue", (SCREEN_WIDTH - metrics2.stringWidth("Press SPACE to continue")) / 2, g.getFont().getSize()+650);

        }
    }

    public void move() {

        y[0][1]=Farbe;
        x[0][1]=Farbe;

        for (int i = x.length-1; i > 0; i--) {
            x[i][0] = x[i - 1][0];
            x[i][1] = x[i - 1][1];
            y[i][0] = y[i - 1][0];
            x[i][1] = x[i - 1][1];
        }
        switch (direction) {
            case 'U':
                y[0][0] = y[0][0] - UNIT_SIZE;
                break;
            case 'D':
                y[0][0] = y[0][0] + UNIT_SIZE;
                break;
            case 'L':
                x[0][0] = x[0][0] - UNIT_SIZE;
                break;
            case 'R':
                x[0][0] = x[0][0] + UNIT_SIZE;
                break;
        }
        direction =65;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            //checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_A -> direction = 'L';
                case KeyEvent.VK_D -> direction = 'R';
                case KeyEvent.VK_W -> direction = 'U';
                case KeyEvent.VK_S -> direction = 'D';
            }

        }
    }

}