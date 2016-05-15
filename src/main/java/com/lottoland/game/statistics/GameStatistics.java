package com.lottoland.game.statistics;

import com.lottoland.game.GameResult;
import com.lottoland.game.player.IPlayer;

public class GameStatistics {

	private IPlayer player1;
	
	private IPlayer player2;
	
	private int player1WinsCount = 0;

	private int player2WinsCount = 0;

	private int drawsCount = 0;
	
	public GameStatistics(IPlayer player1, IPlayer player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public IPlayer getPlayer1() {
		return player1;
	}

	public void setPlayer1(IPlayer player1) {
		this.player1 = player1;
	}

	public IPlayer getPlayer2() {
		return player2;
	}

	public void setPlayer2(IPlayer player2) {
		this.player2 = player2;
	}

	public int getPlayer1WinsCount() {
		return player1WinsCount;
	}

	public void setPlayer1WinsCount(int player1WinsCount) {
		this.player1WinsCount = player1WinsCount;
	}

	public int getPlayer2WinsCount() {
		return player2WinsCount;
	}

	public void setPlayer2WinsCount(int player2WinsCount) {
		this.player2WinsCount = player2WinsCount;
	}

	public int getDrawsCount() {
		return drawsCount;
	}

	public void setDrawsCount(int drawsCount) {
		this.drawsCount = drawsCount;
	}
	
	public int getTotalGamesCount() {
		return player1WinsCount + player2WinsCount + drawsCount;
	}
	
	public void addStatistics(GameResult gameResult) {
		switch (gameResult) {
			case DRAW:
				drawsCount++;
				break;
			case PLAYER_1_WIN:
				player1WinsCount++;
				break;
			case PLAYER_2_WIN:
				player2WinsCount++;
				break;
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("***Overall game statistics***\n");
		sb = sb.append("Total games played: ").append(getTotalGamesCount()).append("\n");
		sb = sb.append("Player1 (").append(player1.getClass()).append(") win games count: ").append(getPlayer1WinsCount()).append("\n");
		sb = sb.append("Player2 (").append(player2.getClass()).append(") win games count: ").append(getPlayer2WinsCount()).append("\n");
		sb = sb.append("Total draws count: ").append(getDrawsCount()).append("\n");
		
		return sb.toString();
	}
	
}
