package InterCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Question: String Matching in an Array
//Input: words = ["mass","as","hero","superhero"]
//Output: ["as","hero"]
//Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
//["hero","as"] is also a valid answer.

public class MatchingStringinArray {
    public static List<String> stringMatching(String[] words) {
         List<String> substrings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    substrings.add(words[i]);
                    break;
                }
            }
        }
        return substrings;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        List<String> result = stringMatching(words);
        System.out.println("Output: " + result);
        scanner.close();
    }
}
