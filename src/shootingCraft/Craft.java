package shootingCraft;

import javax.swing.*;
import java.awt.*;

public class Craft {
    private int x;
    private int y;

    private Image image;


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

}
