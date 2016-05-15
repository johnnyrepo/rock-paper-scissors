package com.lottoland.game.player;

import java.util.Random;

import com.lottoland.game.MoveType;

public class RandomPlayer implements IPlayer {

	public MoveType nextMove() {
		Random generator = new Random(System.currentTimeMillis());
		
		int moveIndex = generator.nextInt(MoveType.values().length);
		
		return MoveType.values()[moveIndex];
	}

}
