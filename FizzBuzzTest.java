public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int x = 1; x < 100; ++x) {
            System.out.println(fizzBuzz.fizzBuzz(x));
        }
    }
}