package com.lottoland.game.player;

import com.lottoland.game.MoveType;

public class RockPlayer implements IPlayer {

	public MoveType nextMove() {
		return MoveType.ROCK;
	}

}
