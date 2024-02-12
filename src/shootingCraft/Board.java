package shootingCraft;

import javax.swing.*;
import java.awt.*;


public class Board extends JPanel {

    private Craft craft;

    public Board() {
        setFocusable(true);
        setBackground(Color.white);
        craft = new Craft();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);
        graphics.dispose();

    }
}

