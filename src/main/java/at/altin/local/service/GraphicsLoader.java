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
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
