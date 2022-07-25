package at.altin.local.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsLoader {
    public GraphicsLoader() {
    }


    public static BufferedImage loadGraphics(String path) {
        BufferedImage image = null;

        try {
            image = ImageIO.read(ResourceLoader.load("/" + path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }


    public static BufferedImage readGraphics(String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(setPath(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    /***
     *
     * @param name
     * @return
     *
     * name = Projektpfad
     */

    public static String setPath(String name){
        //hier Pfad anpassen
        String projectPath= "C:\\Users\\User\\IdeaProjects\\NewGame\\src\\main\\java\\at\\altin\\local\\pictures\\";

        return projectPath+name;
    }
}
