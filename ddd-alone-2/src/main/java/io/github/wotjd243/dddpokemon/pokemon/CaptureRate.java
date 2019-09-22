package io.github.wotjd243.dddpokemon.pokemon;

public class CaptureRate {
	private int captureRate;

	public CaptureRate(int captureRate) {
		this.captureRate = captureRate;
	}

	int get() {
		return this.captureRate;
	}

	boolean isCaught(final int number) {
		return this.get() < number;
	}

//	void change(final int number) {
//		this.captureRate = number;
//	}

	CaptureRate change(final int number) {
		return new CaptureRate(number);
	}
}
