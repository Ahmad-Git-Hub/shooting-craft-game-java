package shootingCraft;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Craft {
    int alterMissile = 1;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private final Image image;

    private int width;
    private int height;
    boolean visible;

    private ArrayList<Missile> missiles;




    public Craft() {
        ImageIcon imageIcon = new ImageIcon("static\\craftImageV2.png");
        image = imageIcon.getImage();
        x = 160;
        y = 160;

        height = image.getHeight(null);
        width = image.getWidth(null);
        visible = true;
        missiles = new ArrayList<Missile>();
    }
    public ArrayList<Missile> getMissiles() {
        return missiles;
    }
    public void setVisible(boolean bol)
    {
        this.visible = bol;
    }
    public boolean isVisible(){
        return this.visible;
    }
    public Rectangle getBound(){
        return new Rectangle(x,y,width,height);
    }

    public void fire() {
        Missile missile;
        if(alterMissile > 0) {
           missile  = new Missile(x + width, y + (height / 2));
        } else {
            missile = new Missile(x + width, y +  (height/4));

        }
        alterMissile *= -1;
        missiles.add(missile);
    }

    public void setMissiles(ArrayList<Missile> missiles) {
        this.missiles = missiles;
    }

    public Image getImage() {
        return image;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            if (x >= 0)
                dx = -5;
            else
                dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            if (x <= 400)
                dx = 5;
            else
                dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            if (y >= 0)
                dy = -5;
            else
                dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            if (y <= 300)
                dy = 5;
            else
                dy = 0;
        }
    }


    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }


}
