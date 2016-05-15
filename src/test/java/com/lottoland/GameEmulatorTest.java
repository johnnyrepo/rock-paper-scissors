package com.lottoland;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.lottoland.game.MoveType;
import com.lottoland.game.player.IPlayer;
import com.lottoland.game.statistics.GameStatistics;

public class GameEmulatorTest {

	private GameEmulator gameEmulator;

	@Before
	public void setUp() {
		this.gameEmulator = new GameEmulator();
	}
	
	@Test
	public void testEmulate() {
		String expectedToString1 = "***Overall game statistics***\n";
		String expectedToString2 = "Total games played: 3\n";
		String expectedToString3 = "win games count: 1\n";
		String expectedToString4 = "Total draws count: 1\n";
		
		IPlayer player1 = Mockito.mock(IPlayer.class);
		IPlayer player2 = Mockito.mock(IPlayer.class);
		
		Mockito.when(player1.nextMove()).thenReturn(MoveType.PAPER, MoveType.ROCK, MoveType.SCISSORS);
		Mockito.when(player2.nextMove()).thenReturn(MoveType.ROCK, MoveType.PAPER, MoveType.SCISSORS);
		
		GameStatistics stats = gameEmulator.emulate(3, player1, player2);
		
		assertNotNull(stats);
		assertEquals(1, stats.getDrawsCount());
		assertEquals(1, stats.getPlayer1WinsCount());
		assertEquals(1, stats.getPlayer2WinsCount());
		assertEquals(3, stats.getTotalGamesCount());
		assertEquals(player1, stats.getPlayer1());
		assertEquals(player2, stats.getPlayer2());
		assertTrue(stats.toString().contains(expectedToString1));
		assertTrue(stats.toString().contains(expectedToString2));
		assertTrue(stats.toString().contains(expectedToString3));
		assertTrue(stats.toString().contains(expectedToString4));
	}
	
}
