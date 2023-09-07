package me.bluenitrox.frames;

import me.bluenitrox.panel.GameoverPanel;

import javax.swing.*;

public class GameoverFrame extends JFrame {


    public GameoverFrame() {

        this.add(new GameoverPanel());
        this.setTitle("Snake Game v1.3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
