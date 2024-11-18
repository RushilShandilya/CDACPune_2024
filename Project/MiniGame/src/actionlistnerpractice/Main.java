package actionlistnerpractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener {
    public static void main(String[] args){
        makePanel();
    }
    public static JFrame makeFrame(){
        JFrame mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setBounds(0,0,400,400);
        mainFrame.setBackground(Color.black);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        return mainFrame;
    }
    public static JPanel makePanel(){
        JPanel panel = new JPanel(new FlowLayout());
        JButton button = new JButton("Click Me");

        button.setBackground(Color.pink);

        JFrame frame = makeFrame();
        frame.add(panel.add(button));

        return panel;
    }
    public static void updateCount(){
        JLabel label = new JLabel("This is a Label");
        label.setSize(50,50);
        label.setVisible(true);
        JPanel panel =  makePanel();
        panel.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
