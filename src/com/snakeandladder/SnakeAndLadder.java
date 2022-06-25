package com.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int Player;
        int playerPosition = 0;
        final int LADDER = 2;
        final int SNAKE = 1;
        while (playerPosition <= 100) {
            int dieRolls = (int) Math.floor((Math.random() * 10) % 6 + 1);
            int option = (int) Math.floor((Math.random() * 10) % 3);

            switch (option) {
                case SNAKE:
                    System.out.println("Die Rolls ...... " + dieRolls);
                    System.out.println("Option is ...... " + option);
                    playerPosition = playerPosition - dieRolls;
                    System.out.println("You got a bite by Snake & Your Position Goes to " + playerPosition);
                    if (playerPosition == 0) {
                        System.out.println("Player position is Same " + playerPosition);
                    }
                    break;
                case LADDER:
                    System.out.println("Die Rolls ...... " + dieRolls);
                    System.out.println("Option is ...... " + option);
                    playerPosition = playerPosition + dieRolls;
                    if (playerPosition > 100) {
                        playerPosition = 100;
                    }
                    System.out.println("Got a Ladder & Your Position Goes to " + playerPosition);
                    break;
                default:
                    System.out.println("Please Try Roll Die Again");
            }
            playerPosition++;
        }
    }
}

