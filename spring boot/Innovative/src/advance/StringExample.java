package advance;

public class StringExample {

	public static void main(String[] args) {
		
		char name[] = {'S','A','N','A'};
		String s = new String(name);
		System.out.println(s);
		
		String str = new String("Zoro"); //object
		System.out.println(str);
		
		String str2="Zoro"; //literals
		String str3 = "Zoro";
		
		System.out.println("Literals(==): "+ (str2==str3)); //T
		System.out.println("Literal with object(==): "+ (str==str2)); //F

		System.out.println("Literals(equals): "+ (str2.equals(str3))); //T
		System.out.println("Literal with object(equals=): "+ (str.equals(str3))); //T
	}
}
