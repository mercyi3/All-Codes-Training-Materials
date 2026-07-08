package InterCodes;
import java.util.Scanner;

//Question: Count Prefix and Suffix Pairs
//Input: words = ["a","aba","ababa","aa"]
//Output: 4
//Explanation: In this example, the counted index pairs are:
//i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
//i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
//i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
//i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
//Therefore, the answer is 4.

class FindingPrefixSuffix {
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
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
        int result = countPrefixSuffixPairs(words);
        System.out.println("Output: " + result);
        scanner.close();
    }
    public static boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}