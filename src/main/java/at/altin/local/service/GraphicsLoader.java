package at.altin.local.service;
import at.altin.local.pictures.CanvasPictures;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsLoader {
        public static String absolutePath= CanvasPictures.path.replace("/","\\");//hier wird der Pfad vom Ordner in deinem PC gesucht
        //hier wird der komplette Pfad gesucht
        public static String finalPath= absolutePath.substring(0,absolutePath.lastIndexOf("SpaceWars"))+"SpaceWars\\src\\main\\java\\at\\altin\\local\\pictures\\";

    public static BufferedImage readGraphics(String path) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(finalPath+ path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
