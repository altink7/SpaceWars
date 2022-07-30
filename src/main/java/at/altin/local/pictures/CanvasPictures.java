package at.altin.local.pictures;
import java.awt.*;

public class CanvasPictures extends Canvas {
    public static String path= CanvasPictures.class.getProtectionDomain().getCodeSource().getLocation().getPath();

    public CanvasPictures() {
    }

    public CanvasPictures(GraphicsConfiguration config) {
        super(config);
    }

    @Override
    public String toString() {
        return "CanvasPictures{" +
                "accessibleContext=" + accessibleContext +
                '}';
    }
}
