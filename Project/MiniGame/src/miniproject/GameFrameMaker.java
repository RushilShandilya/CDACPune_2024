package miniproject;

import javax.swing.*;
import java.awt.*;

public class GameFrameMaker {
    public static JFrame gameFrameMaker(){
        JFrame gameFrame = new JFrame("This is my First Java Frame");
        gameFrame.setSize(1920,1080);
        gameFrame.setBackground(Color.BLACK);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return gameFrame;
    }
}
