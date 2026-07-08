package Thread;

public class TryCatchEx {
	static void sum() {
		int a=19;
		int c = a/0; //error 
		System.out.println(c);
	}
	static void print() {
		System.out.println("After Exception");
	}
	public static void main(String[] args) {
		try {
			sum();
		}
		catch(Exception t) {
			System.out.println(t);
		}
		finally {
			System.out.println("Finally Block");
		}
		print();
	}
}
