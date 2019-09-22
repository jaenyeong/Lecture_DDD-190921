package io.github.wotjd243.dddpokemon.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {
//	Pokemon pokemon = new Pokemon(0, "name", 0);

//	@DisplayName("포켓몬 생성")
	@DisplayName("`Pokemon`은 이름과 `National Pokedex Number`와 `Capture rate`를 가진다.")
	@Test
	void create() {
		// given
		// when
		// then
		new Pokemon(1, "이상해씨", 45);
	}

	@DisplayName("게산된 포획률이 포켓몬의 포획률보다 높을 때")
//	@Test
//	void isCaught_Should_be_true() {
	@ParameterizedTest
	@ValueSource(ints = {100, 75, 50})
	void isCaught_Should_be_true(final int param) {
		// given
		final Pokemon pokemon = new Pokemon(1, "이상해씨", 45);

		// when
		final boolean caught = pokemon.isCaught(100);

		// then
		assertThat(caught);
	}

	//	@Test
//	void testIsCaught() {
//		boolean result = pokemon.isCaught(0);
//		Assertions.assertEquals(true, result);
//	}


}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
