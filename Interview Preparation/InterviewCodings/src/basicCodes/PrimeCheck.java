package basicCodes;

public class PrimeCheck 
{
	public static void main(String[] args) {
        int num = 29; 
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        if (num <= 3) {
            return true; 
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; 
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; 
            }
        }
        return true; 
    }
}
