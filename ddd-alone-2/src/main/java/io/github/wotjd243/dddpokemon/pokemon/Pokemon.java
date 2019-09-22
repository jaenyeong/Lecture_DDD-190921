package io.github.wotjd243.dddpokemon.pokemon;

public class Pokemon {
	private final NationalPokedexNumber number;
	private final String name;
	private CaptureRate captureRate;

	public Pokemon(final int number, String name, final int captureRate) {
		this.number = NationalPokedexNumber.from(number);
		this.name = name;
		this.captureRate = new CaptureRate(captureRate);
	}

	public boolean isCaught(final int number) {
		return this.captureRate.isCaught(number);
	}

	public void changeCaptureRate(final int number) {
		this.captureRate = new CaptureRate(number);
		this.captureRate = this.captureRate.change(number);
	}

	public int getNumber() {
		return number.getNumber();
	}
}

//class BaseEntity {
//	private Long id;
//}
