package shootingCraft;


import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

    public class Missile {
        private int x;
        private int y;
        private int width;
        private int height;

        boolean visible;

        private final int BOARD_WIDTH = 500; // frame width is 600
        private final int MISSILE_SPEED = 2;
        private final Image image;


        public void addMissile(int x, int y) {
            ImageIcon imageIcon = new ImageIcon("static\\missile.png");
            image = imageIcon.getImage();
            this.x = x;
            this.y = y;
            height = image.getHeight(null);
            width = image.getWidth(null);
            visible = true;
        }

        public Image getImage() {
            return image;
        }




    }
