package shootingCraft;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Alien {
        private int x, y, width, height;
        boolean visible;
        private Image image;


        private final int BOARD_WIDTH = 600; // frame width is 600
        private final int ALIEN_SPEED = 2;



        public Alien(int x, int y) {
            ImageIcon imageIcon = new ImageIcon("static\\enemy.png");
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
            x -= ALIEN_SPEED;
            if(x < 0) {
                x = BOARD_WIDTH;
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



        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }




}
