package com.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int Player;
        int Position = 0;
        final int LADDER = 2;
        final int SNAKE = 1;
        int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
        int option = (int) Math.floor((Math.random() * 10) % 3);
        System.out.println("Option " + option);
        switch (option) {
            case SNAKE:
                System.out.println("Die Rolls ...... " + dieRolls);
                Position = Position - dieRolls;
                if (Position < 0){
                    Position = 0;
                }
                System.out.println("You got bite by a Snake & Your Position Goes to " + Position);
                break;
            case LADDER:
                System.out.println("Die Rolls ...... " + dieRolls);
                Position = Position + dieRolls;
                System.out.println("Got a Ladder & Your Position Goes to " + Position);
                break;
            default:
                System.out.println("Player position is Same");
        }
    }
}

