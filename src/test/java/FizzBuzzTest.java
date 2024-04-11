import org.junit.jupiter.api.Test;

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

    @Test
    void when_provided_3_returns_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(3)).isEqualTo("Fizz");
    }

    @Test
    void when_provided_5_returns_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(5)).isEqualTo("Buzz");
    }

    @Test
    void when_provided_15_returns_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzzOf(15)).isEqualTo("FizzBuzz");
    }
}
