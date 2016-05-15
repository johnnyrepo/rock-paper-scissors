package com.lottoland.game.player;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.lottoland.game.MoveType;

public class RandomPlayerTest {

	private RandomPlayer randomPlayer;

	@Before
	public void setUp() {
		randomPlayer = new RandomPlayer();
	}
	
	@Test
	public void testNextMoveOnce() {
		MoveType nextMove = randomPlayer.nextMove();
		
		assertNotNull(nextMove);
	}
	
	@Test
	public void testNextMoveIsRock() {
		System.out.printf("\n\n***Testing out for '%s' move***\n", MoveType.ROCK);
		
		boolean isLoop = true;
		int count = 0;
		
		while (isLoop) {
			count++;
			MoveType nextMove = randomPlayer.nextMove();
			System.out.printf("Next move is '%s'\n", nextMove.toString());
			if (nextMove.equals(MoveType.ROCK)) {
				isLoop = false;
				System.out.printf("Got '%s' move after %d iterations\n", MoveType.ROCK, count);
			}
		}
	}
	
	@Test
	public void testNextMoveIsPaper() {
		System.out.printf("\n\n***Testing out for '%s' move***\n", MoveType.PAPER);
		
		boolean isLoop = true;
		int count = 0;
		
		while (isLoop) {
			count++;
			MoveType nextMove = randomPlayer.nextMove();
			System.out.printf("Next move is '%s'\n", nextMove.toString());
			if (nextMove.equals(MoveType.PAPER)) {
				isLoop = false;
				System.out.printf("Got '%s' move after %d iterations\n", MoveType.PAPER, count);
			}
		}
	}
	
	@Test
	public void testNextMoveIsScissors() {
		System.out.printf("\n\n***Testing out for '%s' move***\n", MoveType.SCISSORS);
		
		boolean isLoop = true;
		int count = 0;
		
		while (isLoop) {
			count++;
			MoveType nextMove = randomPlayer.nextMove();
			System.out.printf("Next move is '%s'\n", nextMove.toString());
			if (nextMove.equals(MoveType.SCISSORS)) {
				isLoop = false;
				System.out.printf("Got '%s' move after %d iterations\n", MoveType.SCISSORS, count);
			}
		}
	}
	
}
