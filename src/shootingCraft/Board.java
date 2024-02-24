package shootingCraft;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Board extends JPanel implements ActionListener {
    private final Craft craft;

    public Board(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
        craft=new Craft();
        Timer timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);
        Toolkit.getDefaultToolkit().sync();
        graphics.dispose();


    }
    public void actionPerformed(ActionEvent e) {
        craft.move();
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
