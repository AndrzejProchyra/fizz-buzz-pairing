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
}
