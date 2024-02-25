package shootingCraft;


import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Craft {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private final Image image;




    public Craft() {
        ImageIcon imageIcon = new ImageIcon("static\\myCraft.png");
        image = imageIcon.getImage();
        x = 160;
        y = 160;
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
