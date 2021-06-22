package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to Snake and Ladder Simulation");
		int playerPosition = 0;  //Single player at start position zero
		int die = (int) (Math.random()*6 +1); //Using random to get a number b/w 1 to 6
		System.out.println(die);
		
	}
}
