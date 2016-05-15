package com.lottoland.game.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.lottoland.game.MoveType;

public class RockPlayerTest {

	private RockPlayer rockPlayer;

	@Before
	public void setUp() {
		rockPlayer = new RockPlayer();
	}
	
	@Test
	public void testNextMoveIsRockOnce() {
		MoveType nextMove = rockPlayer.nextMove();
		
		assertNotNull(nextMove);
		assertEquals(MoveType.ROCK, nextMove);
	}
	
	@Test
	public void testNextMoveIsRock100Times() {
		for (int i = 0; i < 100; i++) {
			MoveType nextMove = rockPlayer.nextMove();
			
			assertNotNull(nextMove);
			assertEquals(MoveType.ROCK, nextMove);
		}
	}
	
}
