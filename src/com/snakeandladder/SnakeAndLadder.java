package com.snakeandladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        final int LADDER = 2;
        final int SNAKE = 1;
        final int NO_PLAY = 0;
        int dieRolls = 0;
        while (playerPosition <= 100) {
            dieRolls++;
            int dieRolling = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            int option = (int) Math.floor((Math.random() * 10) % 3);

            switch (option) {
                case NO_PLAY:
                    System.out.println("There will be no play. Player will be at same position");
                    break;
                case SNAKE:
                    System.out.println("Number on die is: " + dieRolling);
                    playerPosition = playerPosition - dieRolls;
                    System.out.println("You got a bite by Snake & Your Position Goes to " + playerPosition);
                    if (playerPosition <= 0) {
                        System.out.println("Player position is " + playerPosition);
                    }
                    break;
                case LADDER:
                    System.out.println("Number on die is: " + dieRolling);
                    playerPosition = playerPosition + dieRolls;
                    if (playerPosition >= 100) {
                        playerPosition = 100;
                    }
                    System.out.println("Got a Ladder & Your Position Goes to " + playerPosition);
                    break;
                default:
                    break;
            }
            playerPosition++;
        }
        System.out.println("Total No Of DieRolls:" + dieRolls);
    }
}

