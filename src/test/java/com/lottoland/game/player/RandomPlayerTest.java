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
		boolean isLoop = true;
		
		while (isLoop) {
			MoveType nextMove = randomPlayer.nextMove();
			if (nextMove.equals(MoveType.ROCK)) {
				isLoop = false;
			}
		}
	}
	
	@Test
	public void testNextMoveIsPaper() {
		boolean isLoop = true;
		
		while (isLoop) {
			MoveType nextMove = randomPlayer.nextMove();
			if (nextMove.equals(MoveType.PAPER)) {
				isLoop = false;
			}
		}
	}
	
	@Test
	public void testNextMoveIsScissors() {
		boolean isLoop = true;
		
		while (isLoop) {
			MoveType nextMove = randomPlayer.nextMove();
			if (nextMove.equals(MoveType.SCISSORS)) {
				isLoop = false;
			}
		}
	}
	
}
