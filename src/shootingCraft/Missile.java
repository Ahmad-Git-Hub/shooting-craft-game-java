package shootingCraft;


import java.awt.Image;
import java.awt.Rectangle;
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
        private Image image;


        public void addMissile(int x, int y) {
            ImageIcon imageIcon = new ImageIcon("static\\missile.png");
            image = imageIcon.getImage();
            this.x = x;
            this.y = y;
            height = image.getHeight(null);
            width = image.getWidth(null);
            visible = true;
        }
        public Rectangle getBound(){
            return new Rectangle(x,y,width,height);
        }

        public void move() {
            x+=MISSILE_SPEED;
            if(x > BOARD_WIDTH) {
                visible = false;
            }
        }

        public boolean isVisible(){
            return this.visible;
        }
        public void setVisible(boolean bol)
        {
            this.visible = bol;
        }
        public Image getImage() {
            return image;
        }


        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
