package com.lottoland;

import com.lottoland.game.player.RandomPlayer;
import com.lottoland.game.player.RockPlayer;
import com.lottoland.game.statistics.GameStatistics;

/**
 * Reads console, launches game
 *
 */
public class GameLauncher {

	private final static int TOTAL_GAME_COUNT = 100;

	public static void main(String[] args) {
		System.out.println("Launching the game!\n\n");
				
		RockPlayer rockPlayer = new RockPlayer();
		RandomPlayer randomPlayer = new RandomPlayer();
		
		GameEmulator emulator = new GameEmulator();
		GameStatistics statistics = emulator.emulate(TOTAL_GAME_COUNT, rockPlayer, randomPlayer);
		
		System.out.println(statistics);
	}

}
