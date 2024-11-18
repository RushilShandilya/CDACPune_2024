package miniproject;

import javax.swing.*;
import java.awt.*;

public class GamePanelMaker extends JPanel{
    private int initialX = 0,initialY=0,lengthOfSquare=60 , count = 0;
    Color currentColor = Color.cyan;

    public GamePanelMaker(){
        setFocusable(true);
        requestFocusInWindow();
        GameKeyListener listener = new GameKeyListener(this);
        this.addKeyListener(listener);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(currentColor);
        g.drawRect(initialX,initialY,lengthOfSquare,lengthOfSquare);
    }

    public int getLengthOfSquare(){ return lengthOfSquare; }

    public void moveSquare(int deltaX,int deltaY){
        initialX+=deltaX;
        initialY+=deltaY;

        if(initialX<=0) initialX = 0;
        if(initialY<=0) initialY = 0;

        if(initialX>=1860) initialX = 1860;
        if(initialY>=1020) initialY = 960;

        ++count;
        if(count%2==0) currentColor = Color.cyan;
        else currentColor = Color.green;

        repaint();
    }
}
