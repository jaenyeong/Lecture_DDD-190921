package io.github.wotjd243.dddpokemon.pokemon;

import java.util.Objects;

public class NationalPokedexNumber {
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 151;
	private final int number;

	public NationalPokedexNumber(int number) {
		validate(number);
		this.number = number;
	}

	private void validate(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException();
		}
	}

	// 팩토리 메소드
	public static NationalPokedexNumber from(final int number) {
		return new NationalPokedexNumber(number);
	}

	public int getNumber() {
		return this.number;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NationalPokedexNumber that = (NationalPokedexNumber) o;
		return number == that.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
