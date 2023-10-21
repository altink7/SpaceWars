package at.altin.local.handlers;

import at.altin.local.display.GameObject;

import java.awt.*;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class ObjectHandler {
    public static LinkedList<GameObject> list = new LinkedList<>();


    public ObjectHandler() {
    }

    public static void addObject(GameObject o) {
        list.add(o);
    }

    public static void removeObject(GameObject o) {
        list.remove(o);
    }

    public static void render(Graphics g) {
        GameObject temp;

        for (GameObject gameObject : list) {
            temp = gameObject;
            temp.render(g);
        }

    }

    public static void tick() {
        GameObject temp;

        for (GameObject gameObject : list) {
            temp = gameObject;
            temp.tick();
        }

    }
}