package at.altin.local;
import at.altin.local.display.ClickArea;
import at.altin.local.display.Window;
import at.altin.local.gameObjects.Spaceship;
import at.altin.local.handlers.KeyHandler;
import at.altin.local.handlers.MouseHandler;
import at.altin.local.handlers.ObjectHandler;
import at.altin.local.levels.level1;
import at.altin.local.service.GraphicsLoader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.ServerSocket;
import java.net.URL;


public class Game extends Canvas implements Runnable{
    public static int phase =0;
    public static final int WIDTH = 1200;
    public static final int HEIGHT = 750;
    public boolean running;
    public static boolean gameover;
    public static BufferedImage img_welcome;
    public static BufferedImage img_spaceships;
    public static BufferedImage img_button;
    public static boolean spaceshipSelected;
    public static ClickArea[] button_select = new ClickArea[4];
    public static Spaceship spaceship;
    public static int score;
    Thread thread;
    public ServerSocket serverSocket;
    public static int keyNumber=0;

    /***JavaDoc
     * -Hier wird das Spiel ausgeführt
     *
     *
     */
    public Game() {
    }

    /***Main
     *ein neues Fenster wird hinzugefügt,
     *eine Änderung von der Größe wird nicht empfohlen
     *
     */
    public static void main(String[] args) {
        new Window(WIDTH, HEIGHT, "NewGame", new Game());
    }

    public synchronized void start() {
        this.addKeyListener(new KeyHandler());
        this.addMouseListener(new MouseHandler());
        this.running = true;
        this.thread = new Thread();
        this.thread.start();
        this.run();
    }

    public void init() {
        score=0;
        gameover=false;
        running=true;
        img_welcome = GraphicsLoader.readGraphics("C:\\Users\\User\\IdeaProjects\\NewGame\\src\\main\\java\\at\\altin\\local\\pictures\\welcome_rev1.png");
        img_spaceships = GraphicsLoader.readGraphics("C:\\Users\\User\\IdeaProjects\\NewGame\\src\\main\\java\\at\\altin\\local\\pictures\\spaceships.png");
        img_button=GraphicsLoader.readGraphics("C:\\Users\\User\\IdeaProjects\\NewGame\\src\\main\\java\\at\\altin\\local\\pictures\\button.png");
        int xValue=10;
        for(int i =0;i< button_select.length;i++) {
            button_select[i] = new ClickArea(xValue, 600, 150, 85, img_button);
            xValue+=295;
        }
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
        } else {
            Graphics g = bs.getDrawGraphics();
            ObjectHandler.render(g);
            if(keyNumber==0&&!spaceshipSelected) {
                phase=1; // Phase 1 ist Startbildschirm
                g.fillRect(0, 0, 1200, 750);
                g.drawImage(img_welcome, 0, 0, null);
                g.setFont(new Font("Arial", 1, 48));
                g.setColor(Color.WHITE);
                String s = "Press Space";
                int textWidth = g.getFontMetrics().stringWidth(s);
                g.drawString(s, 950 - textWidth / 2, 200);
            }
            else if(keyNumber==10&&!spaceshipSelected){
                phase=2; //Phase 2: hier wird ein Raumschiff gewählt
                g.setColor(Color.lightGray);
                g.fillRect(0, 0, 1200, 750);
                g.drawImage(img_spaceships,0,0,null);
                g.setFont(new Font("Arial", 2, 48));
                g.setColor(Color.WHITE);
                String s = "Wähle dein Raumschiff!";
                int textWidth = g.getFontMetrics().stringWidth(s);
                g.drawString(s, WIDTH/2 - textWidth / 2, 100);

                for(ClickArea b: button_select){
                    b.render(g);
                }
            }
            else if(spaceshipSelected){
                phase=3; //Phase 2: hier wird ein Raumschiff gewählt
                g.setColor(Color.lightGray);
                g.fillRect(0, 0, 1200, 750);
                g.setFont(new Font("Arial", 2, 48));
                g.setColor(Color.BLACK);
                String s = "Schritt3, Schiff "+MouseHandler.selectedButton+"gewählt!";
                int textWidth = g.getFontMetrics().stringWidth(s);
                g.drawString(s, WIDTH/2 - textWidth / 2, 100);
            }
            g.dispose();
            bs.show();
        }
    }

    public void tick() {
        if (!gameover) {
            ObjectHandler.tick();
        }

    }

    public void test() {
    }



    @Override
    public void run() {
        this.init();
        this.requestFocus();
        long pastTime = System.nanoTime();
        double amountOfTicks = 60.0D;
        double ns = 1.0E9D / amountOfTicks;
        double delta = 0.0D;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(this.running) {
            long now = System.nanoTime();
            delta += (double)(now - pastTime) / ns;

            for(pastTime = now; delta > 0.0D; --delta) {
                this.tick();
                ++updates;
                this.render();
                ++frames;
            }

            if (System.currentTimeMillis() - timer > 1000L) {
                timer += 1000L;
                System.out.println("FPS: " + frames + " | TICKS: " + updates);
                updates = 0;
                frames = 0;
            }
        }
    }
}