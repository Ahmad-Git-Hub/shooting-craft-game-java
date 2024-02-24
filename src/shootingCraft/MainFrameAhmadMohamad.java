package shootingCraft;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class MainFrameAhmadMohamad extends JFrame{
    public MainFrameAhmadMohamad (){
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("Shooting Craft Game");
        setResizable(false);
        setIconImage(new ImageIcon("static\\frameIcon.png").getImage());
        setVisible(true);

    }



    public static void main(String[] args) {
        MainFrameAhmadMohamad mainFrame = new MainFrameAhmadMohamad();

    }

}
