package main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

// jFrame is our window. its a frame for our painting
public class GameWindow {
    private JFrame jframe;
    private GamePanel gamePanel;
    public GameWindow(GamePanel gamePanel) {

        jframe = new JFrame();


        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // used bcz our window should close when we press close
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);  //window will start on center
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
        jframe.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                gamePanel.getGame().windowFocusLost();

            }
        });

    }

}
