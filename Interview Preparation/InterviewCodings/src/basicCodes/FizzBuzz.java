package basicCodes;

// from 1 -100 numbers if number divisible by 3 print Fizz
// divisible by 5 print Buzz, Divisible by 3,5 print FizzBuzz
public class FizzBuzz {
	public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) 
        {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
