package advance;

public class StringOperations {

	public static void main(String[] args) {
		
		String str1 = "HELLO";
		String str2 = "  java  ";
		
		System.out.println("Length: "+ str1.length());
		System.out.println("Char At: "+ str1.charAt(2));
		System.out.println("Uppercase: "+str2.toUpperCase());
		System.out.println("Lowercase: "+str1.toLowerCase());
		System.out.println("Concat: "+ str1.concat(str2));
		System.out.println("Equals: "+ str1.equals(str2));
		System.out.println("Compare: "+ str1 .compareTo(str2));
		System.out.println("Repeat: "+ str1.repeat(3));
		System.out.println("Endswith: "+ str1.endsWith("LO"));
		System.out.println("Startwith: "+ str1.startsWith("R"));
		System.out.println("Substring: "+ str2.substring(3,7));
		System.out.println("Trim: "+ str2.trim());
		System.out.println("Replace: "+ str1.replace("L", "P"));
		
		System.out.println(str1+"\n"+str2);
	}

}
