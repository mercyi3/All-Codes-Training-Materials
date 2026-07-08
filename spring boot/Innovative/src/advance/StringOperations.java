package advance;

public class StringOperations {
	public static void main(String[] args) {
		
		String str1 = "HELLO"; //5 char
		String str2 = "  java  "; //8 char
		System.out.println("Length: "+ str1.length()); //5
		System.out.println("Char At 2 index: "+ str1.charAt(2)); //L
		System.out.println("Uppercase: "+str2.toUpperCase()); //  JAVA  
		System.out.println("Lowercase: "+str1.toLowerCase()); //hello
		System.out.println("Concat: "+ str1.concat(str2)); // HELLO  java  
		System.out.println("Equals: "+ str1.equals(str2)); //false
		System.out.println("Compare: "+ str1.compareTo(str2)); //+1 or -1
		System.out.println("Repeat: "+ str1.repeat(3)); //HELLOHELLOHELLO
		System.out.println("Endswith: "+ str1.endsWith("LO")); //true
		System.out.println("Startwith: "+ str1.startsWith("R")); //false
		System.out.println("Substring: "+ str2.substring(3,7)); //java
		System.out.println("Trim: "+ str2.trim()); //ja  va
		System.out.println("Replace: "+ str1.replace("L", "P")); //HEPPO
		System.out.println(str1+"\n"+str2);
	}
}