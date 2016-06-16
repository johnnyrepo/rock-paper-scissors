package com.lottoland.game;

import com.lottoland.game.player.IPlayer;

public class Game {

	public GameResult play(IPlayer player1, IPlayer player2) {
		GameResult result = null;

		MoveType player1Move = player1.nextMove();
		MoveType player2Move = player2.nextMove();

		if (player1Move.equals(player2Move)) {
			result = GameResult.DRAW;
		} else {
			result = player1Move.isWin(player2Move) ? GameResult.PLAYER_1_WIN : GameResult.PLAYER_2_WIN;
		}
		
//		if (player1Move.equals(player2Move)) {
//			result = GameResult.DRAW;
//		} else if ((player1Move.ordinal() - player2Move.ordinal()) == 1
//				|| (player1Move.ordinal() - player2Move.ordinal()) == -2) {
//			result = GameResult.PLAYER_1_WIN;
//		} else {
//			result = GameResult.PLAYER_2_WIN;
//		}

		return result;
	}

}
