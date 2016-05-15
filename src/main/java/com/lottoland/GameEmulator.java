package com.lottoland;

import com.lottoland.game.Game;
import com.lottoland.game.GameResult;
import com.lottoland.game.player.IPlayer;
import com.lottoland.game.statistics.GameStatistics;

public class GameEmulator {

	public GameStatistics emulate(int gamesCount, IPlayer player1, IPlayer player2) {
		Game game = new Game();
		GameStatistics gameStatistics = new GameStatistics(player1, player2);
		
		for (int i = 0; i < gamesCount; i++) {
			GameResult result = game.play(player1, player2);
			gameStatistics.addStatistics(result);
		}
		
		return gameStatistics;
	}
	
}
