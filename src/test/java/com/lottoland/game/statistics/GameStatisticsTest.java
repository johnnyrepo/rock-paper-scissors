package com.lottoland.game.statistics;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lottoland.game.GameResult;
import com.lottoland.game.player.RandomPlayer;
import com.lottoland.game.player.RockPlayer;

public class GameStatisticsTest {

	private RockPlayer player1;
	private RandomPlayer player2;
	private GameStatistics stats;

	@Before
	public void setUp() {
		this.player1 = new RockPlayer();
		this.player2 = new RandomPlayer();
		this.stats = new GameStatistics(player1, player2);
	}

	@Test
	public void testAddStatisticsDrawPlayer1WinPlayer2Win() {
		String expectedToString = "***Overall game statistics***\n"
				+ "Total games played: 3\n"
				+ "Player1 (class com.lottoland.game.player.RockPlayer) win games count: 1\n"
				+ "Player2 (class com.lottoland.game.player.RandomPlayer) win games count: 1\n"
				+ "Total draws count: 1\n";

		stats.addStatistics(GameResult.DRAW);
		stats.addStatistics(GameResult.PLAYER_1_WIN);
		stats.addStatistics(GameResult.PLAYER_2_WIN);

		assertEquals(1, stats.getDrawsCount());
		assertEquals(1, stats.getPlayer1WinsCount());
		assertEquals(1, stats.getPlayer2WinsCount());
		assertEquals(3, stats.getTotalGamesCount());
		assertEquals(player1, stats.getPlayer1());
		assertEquals(player2, stats.getPlayer2());
		assertEquals(expectedToString, stats.toString());
	}

}
