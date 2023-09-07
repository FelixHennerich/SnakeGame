package me.bluenitrox.frames;

import me.bluenitrox.panel.GamePanel;

import javax.swing.*;

public class GameFrame extends JFrame{


    public GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake Game v1.3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
