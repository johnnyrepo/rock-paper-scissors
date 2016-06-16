package com.lottoland.game;

public enum MoveType {

	ROCK {
		@Override
		public boolean isWin(MoveType type) {
			return type == SCISSORS || type == LIZARD;
		}
	},
	PAPER {
		@Override
		public boolean isWin(MoveType type) {
			return type == ROCK || type == SPOK;
		}
	},
	SCISSORS {
		@Override
		public boolean isWin(MoveType type) {
			return type == PAPER || type == LIZARD;
		}
	},
	LIZARD {
		@Override
		public boolean isWin(MoveType type) {
			return type == PAPER || type == SPOK;
		}
	},
	SPOK {
		@Override
		public boolean isWin(MoveType type) {
			return type == ROCK || type == SCISSORS;
		}
	};

	public abstract boolean isWin(MoveType type);

}
