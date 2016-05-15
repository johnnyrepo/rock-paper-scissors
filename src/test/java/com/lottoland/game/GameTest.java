package com.lottoland.game;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.lottoland.game.player.IPlayer;

public class GameTest {

	private Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void testPlayer1AndPlayer2DrawWithRock() {
		testDraw(MoveType.ROCK);
	}
	
	@Test
	public void testPlayer1AndPlayer2DrawWithPaper() {
		testDraw(MoveType.PAPER);
	}

	@Test
	public void testPlayer1AndPlayer2DrawWithScissors() {
		testDraw(MoveType.SCISSORS);
	}
	
	private void testDraw(MoveType move) {
		IPlayer player1 = Mockito.mock(IPlayer.class);
		IPlayer player2 = Mockito.mock(IPlayer.class);
		
		Mockito.when(player1.nextMove()).thenReturn(move);
		Mockito.when(player2.nextMove()).thenReturn(move);
		
		GameResult result = game.play(player1, player2);
		assertNotNull(result);
		assertEquals(GameResult.DRAW, result);
	}
	
	@Test
	public void testPlayer1RockPlayer2Paper() {
		GameResult result = playGame(MoveType.ROCK, MoveType.PAPER);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_2_WIN, result);
	}

	@Test
	public void testPlayer1RockPlayer2Scissors() {
		GameResult result = playGame(MoveType.ROCK, MoveType.SCISSORS);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_1_WIN, result);
	}
	
	@Test
	public void testPlayer1PaperPlayer2Scissors() {
		GameResult result = playGame(MoveType.PAPER, MoveType.SCISSORS);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_2_WIN, result);
	}
	
	@Test
	public void testPlayer1PaperPlayer2Rock() {
		GameResult result = playGame(MoveType.PAPER, MoveType.ROCK);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_1_WIN, result);
	}
	
	@Test
	public void testPlayer1ScissorsPlayer2Rock() {
		GameResult result = playGame(MoveType.SCISSORS, MoveType.ROCK);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_2_WIN, result);
	}
	
	@Test
	public void testPlayer1ScissorsPlayer2Paper() {
		GameResult result = playGame(MoveType.SCISSORS, MoveType.PAPER);
		
		assertNotNull(result);
		assertEquals(GameResult.PLAYER_1_WIN, result);
	}
	
	private GameResult playGame(MoveType player1Move, MoveType player2Move) {
		IPlayer player1 = Mockito.mock(IPlayer.class);
		IPlayer player2 = Mockito.mock(IPlayer.class);
		
		Mockito.when(player1.nextMove()).thenReturn(player1Move);
		Mockito.when(player2.nextMove()).thenReturn(player2Move);
		
		return game.play(player1, player2);
	}

}
