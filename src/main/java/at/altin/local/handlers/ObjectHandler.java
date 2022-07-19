package at.altin.local.handlers;

import at.altin.local.display.GameObject;

import java.awt.*;
import java.util.LinkedList;

public class ObjectHandler {
    public static LinkedList<GameObject> list = new LinkedList<GameObject>();

    public ObjectHandler() {
    }

    public static void addObject(GameObject o) {
        list.add(o);
    }

    public static void removeObject(GameObject o) {
        list.remove(o);
    }

    public static void render(Graphics g) {
        GameObject temp = null;

        for (GameObject gameObject : list) {
            temp = gameObject;
            temp.render(g);
        }

    }

    public static void tick() {
        GameObject temp = null;

        for (GameObject gameObject : list) {
            temp = gameObject;
            temp.tick();
        }

    }
}