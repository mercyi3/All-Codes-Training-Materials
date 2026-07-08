package InterCodes;

import java.util.Scanner;

// Finding vowels in an given string
public class VowelsFinding 
{
	 public static int countVowels(String str) 
	 {
        int count = 0;
        str = str.toLowerCase(); // Case insensitive
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    } 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
