package me.bluenitrox.panel;

import me.bluenitrox.SnakeGame;
import me.bluenitrox.frames.GameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameoverPanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;

    public GameoverPanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        JButton button = new JButton("Restart");
        button.setSize(30, 30);
        this.add(button);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawScreen(g);
    }
    public void drawScreen(Graphics g){
        Font font = new Font("SansSerif", Font.BOLD, 50);
        Font font2 = new Font("SansSerif", Font.BOLD, 30);
        g.setFont(font);
        g.setColor(Color.BLUE);
        g.drawString("GAME OVER!", SCREEN_HEIGHT/2-150, SCREEN_WIDTH/2);
        g.setColor(Color.WHITE);
        g.setFont(font2);
        g.drawString("Score: " + GamePanel.POINTS, SCREEN_HEIGHT/2-100, SCREEN_WIDTH/2+40);
        if(GamePanel.POINTS > SnakeGame.HIGHSCORE){
            SnakeGame.HIGHSCORE = GamePanel.POINTS;
        }
        g.drawString("Highscore: " + SnakeGame.HIGHSCORE, 25,  40);
        GamePanel.POINTS = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_R:
                    new GameFrame();
                    break;
            }
        }
    }
}
