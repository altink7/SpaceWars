package at.altin.local.service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GraphicsLoader {



    public static BufferedImage loadGraphics(String path) {
        BufferedImage image = null;

        try {
            image = ImageIO.read(ResourceLoader.load("/" + path));
        } catch (Exception var1) {
            var1.printStackTrace();
        }

        return image;
    }
}
