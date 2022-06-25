package com.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int Player;
        int Position = 0;
        int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
        System.out.println("Player position is 0");
        System.out.println("Die is Rolling..... " + dieRolls);
        int newPosition = Position + dieRolls;
        System.out.println("Player Position " + newPosition);
    }
}

