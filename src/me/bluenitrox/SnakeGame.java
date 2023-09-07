package me.bluenitrox;

import me.bluenitrox.frames.GameFrame;

public class SnakeGame {

    public static int HIGHSCORE = 0;

    public static void main(String[] args){

        /*for(int i = 1; i<=20; i++){
            if(i == 13){
                continue;
            }
            System.out.println(i);
        }*/
        new GameFrame();
        System.out.println("SnakeGame started!");

    }

}
