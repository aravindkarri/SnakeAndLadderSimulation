package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	//Constants
	public static final int IS_LADDER = 1;
	public static final int IS_SNAKE = 2;
	public static final int NO_PLAY = 0;

	public static void main(String args[]) {

		System.out.println("Welcome to Snake and Ladder Simulation");
		int playerPosition = 0;  //Single player at start position zero

		while (playerPosition < 100)
		{
			int die = (int) (Math.random()*6 + 1);  //Using random to get a number b/w 1 to 6
			int playerCheck = (int)(Math.random()*3);
			switch (playerCheck) {
			case IS_LADDER:
				System.out.println("player lands on a ladder");
				playerPosition += die;
				if (playerPosition == 100)
				{
					
					System.out.println("Player won! Player final position is: " +playerPosition);
				}
				//if player position go above 100,Using this condition he gets back to previous position
				else if (playerPosition > 100)          
				{                                    
					playerPosition -= die;
				}
				break;
			case IS_SNAKE:
				System.out.println("player lands on a snake ");
				playerPosition -= die;
				//if player position go below 100,player position set to 0
				if (playerPosition < 0)             
				{
					playerPosition = 0;
				}
				break;
			case NO_PLAY:
				System.out.println("player remains on same position");
				break;

			}
			System.out.println("player current position: "+playerPosition);

		}
	}
}
