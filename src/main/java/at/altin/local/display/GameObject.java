package at.altin.local.display;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
@SuppressWarnings("unused")
public abstract class GameObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected float velX;
    protected float velY;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public GameObject(){
    }

    public abstract Point getPoint();

    public abstract void tick();

    public abstract void render(Graphics g);

    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }
}
