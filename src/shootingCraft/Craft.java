package shootingCraft;


import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Craft {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private final Image image;

    int width;
    int height;
    boolean visible;

    private ArrayList<Missile> missiles;




    public Craft() {
        ImageIcon imageIcon = new ImageIcon("static\\myCraft.png");
        image = imageIcon.getImage();
        x = 160;
        y = 160;

        height = image.getHeight(null);
        width = image.getWidth(null);
        visible = true;
        missiles = new ArrayList<Missile>();
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
            fire
        }

        if (key == KeyEvent.VK_LEFT) {
            if (x >= 0)
                dx = -5;
            else
                dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            if (x <= 600 - image.getWidth(null))
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
            if (y <= 400 - image.getHeight(null))
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

    public Rectangle getBound(){
        return new Rectangle(x,y,width,height);
    }
    public ArrayList<Missile> getMissiles() {
        return missiles;
    }
    public boolean isVisible(){
        return this.visible;
    }
    public void setVisible(boolean bol)
    {
        this.visible = bol;
    }
    public void addMissile() {
        Missile missile = new Missile();
        missile.addMissile(x+width, y+height/2);
    }

    public void setMissiles(ArrayList<Missile> missiles) {
        this.missiles = missiles;
    }
}
