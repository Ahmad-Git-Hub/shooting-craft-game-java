package shootingCraft;

import javax.swing.*;

public class MainFrameAhmadMohamad extends JFrame {

    public MainFrameAhmadMohamad() {
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Shooting Craft Game");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrameAhmadMohamad mainFrameAhmadMohamad = new MainFrameAhmadMohamad();
    }

}
