public class FizzBuzz {
    public String fizzBuzzOf(int number) {
        if (number == 5) {
            return "Buzz";
        }
        if (number == 3) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
