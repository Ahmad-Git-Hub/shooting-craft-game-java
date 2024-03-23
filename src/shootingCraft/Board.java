package shootingCraft;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {

    private final Craft craft;
    private ArrayList<Alien> aliens;


private int[][] positions = {
        {1150, 29}, {1660, 59}, {1466, 89},
        {1744, 309}, {1420, 210}, {1609, 469},
        {1580, 599}, {740, 243}, {1700, 539},
        {1620, 459}, {1850, 210}, {1900, 550},
        {1380, 240}, {1240, 430}, {1964, 270},
        {1749, 370}, {1500, 500}, {1600, 420},
        {1700, 149}, {1940, 370}
};

    public Board() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.white);
        setDoubleBuffered(true);
        craft = new Craft();
        Timer timer = new Timer(5, this);
        timer.start();
        initAliens();
    }

        public void initAliens () {
            aliens = new ArrayList<>();
            for (int[] p : positions) {
                aliens.add(new Alien(p[0], p[1]));
            }

        }


        public void paint (Graphics graphics){
            super.paint(graphics);
            Graphics2D graphics2D = (Graphics2D) graphics;
            if (craft.isVisible()) {
                graphics2D.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);
            }
            graphics2D.setColor(Color.black);
            Toolkit.getDefaultToolkit().sync();
            ArrayList<Missile> ms = craft.getMissiles();
            for (Missile m : ms) {
                graphics2D.drawImage(m.getImage(), m.getX(), m.getY(), this);
            }

            for (Alien alien : aliens) {
                if (alien.isVisible()) {
                    graphics2D.drawImage(alien.getImage(), alien.getX(), alien.getY(), this);
                }
            }
            graphics.dispose();
        }

        public void actionPerformed (ActionEvent e){
            craft.move();
            ArrayList<Missile> ms = craft.getMissiles();
            for (int i = 0; i < ms.size(); i++) {
                Missile m = ms.get(i);
                if (m.isVisible()) {
                    m.move();
                } else {
                    ms.remove(m);
                }
            }
                for (int i = 0; i < aliens.size(); i++) {
                    Alien alien = aliens.get(i);
                    if (alien.isVisible()) {
                        alien.move();
                    } else {
                        aliens.remove(alien);
                    }
                }
            repaint();
        }

        private class TAdapter extends KeyAdapter {

            public void keyReleased(KeyEvent e) {
                craft.keyReleased(e);
            }

            public void keyPressed(KeyEvent e) {
                craft.keyPressed(e);
            }
        }



}
