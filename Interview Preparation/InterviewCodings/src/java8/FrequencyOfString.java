package java8;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfString 
{
	public static void main(String[] args) {
		String str = "programming";

		Map<Character, Long> freqMap = str.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(freqMap);
	}
}
