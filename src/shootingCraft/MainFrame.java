package shootingCraft;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        add(new Board());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Shooting Craft Game");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
    }

}
