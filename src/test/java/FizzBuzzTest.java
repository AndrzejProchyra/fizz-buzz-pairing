import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    void when_provided_1_returns_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(1)).isEqualTo("1");
    }

    @Test
    void when_provided_2_returns_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(2)).isEqualTo("2");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6})
    void when_provided_a_number_divisible_by_3_returns_Fizz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5})
    void when_provided_5_returns_Buzz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(number)).isEqualTo("Buzz");
    }

    @Test
    void when_provided_15_returns_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void when_provided_30_returns_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(30)).isEqualTo("FizzBuzz");
    }
}
