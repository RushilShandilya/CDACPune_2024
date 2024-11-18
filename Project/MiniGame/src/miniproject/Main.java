package miniproject;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame gameFrame = GameFrameMaker.gameFrameMaker();
        GamePanelMaker gamePanel = new GamePanelMaker();
        gameFrame.add(gamePanel);

    }
}
